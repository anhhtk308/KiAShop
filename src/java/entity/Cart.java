/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.math.BigDecimal;
/**
 *
 * @author dell
 */
public class Cart {
    private int id;
    private String name;
    private String image;
    private int amount;
    private double price;
    private double totalPrice;

    public Cart() {
    }

    public Cart(int id, String name, String image, int amount, double price, double totalPrice) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.amount = amount;
        this.price = price;
        this.totalPrice = totalPrice;
    }

   

    

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

   

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    

    @Override
    public String toString() {
        return "Cart{" + "id=" + id + ", name=" + name + ", amount=" + amount + ", price=" + price + '}';
    }
    
    
    
    
}
