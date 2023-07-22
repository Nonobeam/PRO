/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Product {
    protected String id;
    protected String name;
    protected double price;
    protected int quantity;
    
    public Product(){
        
    }

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double buying(int number){
        if (number > quantity) return 0;
        double cost;
        cost = price * number;
        quantity -= number;
        return cost;
    }
    
    public void display(){
        if (quantity <= 0){
            System.out.print("[" + id + ", " + name + ", ");
            System.out.format("%.2f", price);
            System.out.print(", " + "Out of stock]\n");
        }else{
            System.out.print("[" + id + ", " + name + ", ");
            System.out.format("%.2f", price);
            System.out.print(", " + quantity + "]" + "\n");
        }
    }
    
}
