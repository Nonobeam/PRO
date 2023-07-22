/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Account {
    protected String id;
    protected String name;
    protected double balance;

    public Account(){
        id = "Empty";
        name = "Empty";
        balance = 0.00;
    }
    
    public Account(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}
