/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Admin
 */
public class Account {
    private int id;
    private String userName;
    private String passWord;
    private int isUser;
    private int isAdmin;

    public Account() {
    }

    public Account(int id, String userName, String passWord, int isUser, int isAdmin) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.isUser = isUser;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getIsUser() {
        return isUser;
    }

    public void setIsUser(int isUser) {
        this.isUser = isUser;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", isUser=" + isUser + ", isAdmin=" + isAdmin + '}';
    }
    
}
