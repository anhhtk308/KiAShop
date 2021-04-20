/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import entity.Category;
import entity.OrderDetails;
import entity.Product;
import entity.SubImage;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<SubImage> getAllSubImageByPID(String cid) {
        List<SubImage> list = new ArrayList<>();
        String query = "select S.*\n"
                + "from Product P, SubImage S\n"
                + "where P.pID = S.pID and S.pID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new SubImage(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getProductForHome() {
        List<Product> list = new ArrayList<>();
        String query = "select * from Home\n";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                int pId = rs.getInt(1);
                String name = rs.getString(2);
                String image = rs.getString(3);
                double price = rs.getDouble(4);
                String title = rs.getString(5);
                String description = rs.getString(6);
                int amount = rs.getInt(8);
                int cateID = rs.getInt(7);
                DAO dao = new DAO();
                List<SubImage> listImage = dao.getAllSubImageByPID(pId + "");
                list.add(new Product(pId, name, image, price, title, description, cateID, listImage, amount));
            }

        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * from Product";
        DAO dao = new DAO();
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7), dao.getAllSubImageByPID(rs.getInt(1) + ""), rs.getInt(8)));
            }

        } catch (Exception e) {
        }
        return list;
    }

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "select * from Category";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                list.add(new Category(rs.getInt(1), rs.getString(2)));
            }

        } catch (Exception e) {
        }
        return list;
    }

    public int getNumberItemsSolid() {
        int n = 0;
        String query = "select SUM(Quantity) from OrderDetails";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            if (rs.next()) {
                n = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return n;
    }

    public double getTotalEarnings() {
        double total = 0;
        List<OrderDetails> list = new ArrayList<>();
        String query = "select * from OrderDetails";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                list.add(new OrderDetails(rs.getInt(1), rs.getInt(2), rs.getDouble(3), rs.getInt(4)));
            }

        } catch (Exception e) {
        }
        for (OrderDetails o : list) {
            total += o.getPrice() * o.getQuantity();
        }
        return total;
    }

    public Account login(String user, String pass) {
        String query = "select * from Account\n"
                + "where userName = ? and passWord = ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account checkExist(String user) {
        String query = "select * from Account\n"
                + "where userName = ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, user);
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void signUp(String username, String password) {
        String query = "insert into Account\n"
                + "values(?,?,1,0)";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Product> getProductByCid(String cid) {
        List<Product> list = new ArrayList<>();
        String query = "select * from Product where cID = ?";
        DAO dao = new DAO();
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, cid);
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7), dao.getAllSubImageByPID(rs.getInt(1) + ""), rs.getInt(8)));
            }

        } catch (Exception e) {
        }
        return list;
    }

    public Product getProductByID(String id) {
        String query = "select * from Product where pID = ?";
        DAO dao = new DAO();
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, id);
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7), dao.getAllSubImageByPID(rs.getInt(1) + ""), rs.getInt(8));
            }

        } catch (Exception e) {
        }
        return null;
    }

    public String getCnameByCID(String cid) {
        String query = "select distinct cName from Product P, Category C\n"
                + "where P.cID = C.cID and P.cID = ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, cid);
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> searchByName(String name) {
        List<Product> list = new ArrayList<>();
        String query = "select * from Product where pName like ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, "%" + name + "%");
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            DAO dao = new DAO();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7), dao.getAllSubImageByPID(rs.getInt(1) + ""), rs.getInt(8)));
            }

        } catch (Exception e) {
        }
        return list;
    }

    public Product getNewestProduct() {
        String query = "select top 1 *\n"
                + "from Product\n"
                + "order by pID desc";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            DAO dao = new DAO();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7), dao.getAllSubImageByPID(rs.getInt(1) + ""), rs.getInt(8));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public int getBestSeller() {
        String query = "with R as(\n"
                + "select ProductID,SUM(Quantity) SL\n"
                + "from Product P, OrderDetails O\n"
                + "where P.pID = O.ProductID\n"
                + "group by ProductID\n"
                + ")\n"
                + "select top 1 R.ProductID from R where SL = (select MAX(SL) from R)\n"
                + "order by R.ProductID desc";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            DAO dao = new DAO();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Integer> getBestSeller1() {
        List<Integer> list = new ArrayList<>();
        String query = "with R as(\n"
                + "select ProductID,SUM(Quantity) SL\n"
                + "from Product P, OrderDetails O\n"
                + "where P.pID = O.ProductID\n"
                + "group by ProductID\n"
                + ")\n"
                + "select R.ProductID from R where SL = (select MAX(SL) from R)";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            DAO dao = new DAO();
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Product getProductbyID(String id) {
        String query = "select * from Product where pID = ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, id);
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            DAO dao = new DAO();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7), dao.getAllSubImageByPID(rs.getInt(1) + ""), rs.getInt(8));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> getProductByPrice(String priceMin, String priceMax) {
        List<Product> list = new ArrayList<>();
        String query = "select *\n"
                + "from Product\n"
                + "where price between ? and ?";
        DAO dao = new DAO();
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, priceMin);
            ps.setString(2, priceMax);
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7), dao.getAllSubImageByPID(rs.getInt(1) + ""), rs.getInt(8)));
            }

        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getAllPagging(int pageIndex, int pageSize) {
        List<Product> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM Product ORDER BY pID OFFSET\n"
                    + "                    (?*?-?) ROWS FETCH NEXT ? ROWS ONLY";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, pageIndex);
            ps.setInt(2, pageSize);
            ps.setInt(3, pageSize);
            ps.setInt(4, pageSize);
            ResultSet rs = ps.executeQuery();
            DAO dao = new DAO();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7), dao.getAllSubImageByPID(rs.getInt(1) + ""), rs.getInt(8)));
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return list;
    }

    public List<Product> getAllPaggingByCategory(int pageIndex, int pageSize, String id) {
        List<Product> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM Product where cID = ? ORDER BY pID OFFSET (?*?-?) ROWS FETCH NEXT ? ROWS ONLY";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setInt(2, pageIndex);
            ps.setInt(3, pageSize);
            ps.setInt(4, pageSize);
            ps.setInt(5, pageSize);
            ResultSet rs = ps.executeQuery();
            DAO dao = new DAO();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7), dao.getAllSubImageByPID(rs.getInt(1) + ""), rs.getInt(8)));
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return list;
    }

    public void insertOrder(String date, int accountID, String address, String sdt, String name, double total) {
        String query = "INSERT INTO [Order](orderDate, accountID,addressReceive,sdt,name,totalPrice)\n"
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, date);
            //ps.setDate(1, (java.sql.Date) date);
            ps.setInt(2, accountID);
            ps.setString(3, address);
            ps.setString(4, sdt);
            ps.setString(5, name);
            ps.setDouble(6, total);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public int getOrderID() {
        String query = "SELECT TOP(1) id from [Order] order BY id DESC";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public void insertOrderDetails(int orderID, int productID, double price, int amount) {
        String query = "INSERT INTO OrderDetails VALUES (?, ?, ?, ?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, orderID);
            ps.setInt(2, productID);
            ps.setDouble(3, price);
            ps.setInt(4, amount);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateAmounProduct(int amount, int productID) {
        String query = "UPDATE Product SET pAmount = ? WHERE pID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, amount);
            ps.setInt(2, productID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void addNewProduct(String name, String image, String price,
            String title, String description, String cid, int amount) {
        String query = "INSERT into Product (pName, [image], price, title, [description], cID, pAmount)\n"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, title);
            ps.setString(5, description);
            ps.setString(6, cid);
            ps.setInt(7, amount);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void addNewSubImage(String pID, String Simage) {
        String query = "INSERT into SubImage (pID, SImage)\n"
                + "VALUES (?, ?)";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, pID);
            ps.setString(2, Simage);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public int getProductIDToAdd() {
        String query = "SELECT TOP(1) pID from Product order BY pID DESC";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public Product checkExistProduct(String name, String image, String price,
            String title, String description, String cid, int amount) {
        String query = "select * from Product\n"
                + "where pName = ? and [image] = ? and price = ? and cID = ? and title = ? and [description] = ? and pAmount = ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, cid);
            ps.setString(5, title);
            ps.setString(6, description);
            ps.setInt(7, amount);
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            DAO dao = new DAO();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7), dao.getAllSubImageByPID(rs.getInt(1) + ""), rs.getInt(8));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public int getViewed() {
        int n = 0;
        String query = "select * from [View]";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            if (rs.next()) {
                n = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return n;
    }

    public void updateViewed() {//edit param
        //edit query (my_table), number of param
        String query = "update [View]\n"
                + "set viewed = viewed + 1";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteSubImage(String pid) {//edit param
        //edit query (my_table), number of param
        String query = "delete from SubImage\n"
                + "where pID = ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteProduct(String pid) {//edit param
        //edit query (my_table), number of param
        String query = "DELETE FROM Product\n"
                + "WHERE pID = ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
    }
}
