/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Order {
    private int id;
    private Date date;
    private int accountID;
    private String address;
    private String sdt;
    private String name;
    private double totalPrice;

    public Order() {
    }

    public Order(int id, Date date, int accountID, String address, String sdt, String name, double totalPrice) {
        this.id = id;
        this.date = date;
        this.accountID = accountID;
        this.address = address;
        this.sdt = sdt;
        this.name = name;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", date=" + date + ", accountID=" + accountID + ", address=" + address + ", sdt=" + sdt + ", name=" + name + ", totalPrice=" + totalPrice + '}';
    }
    
}
