
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class CementProduct extends Product{
    private int insurance;

    public CementProduct() {
    }

    public CementProduct(int insurance, String id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.insurance = insurance;
    }

    public int getInsurance() {
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }
    
    @Override
    public double buying(int num){
        if (num > quantity) return 0;
        double cost = num * price;
        if (quantity > 20){
            cost = cost * 0.9;
            quantity -= num;
        }
        return cost;
    }
    
    @Override
    public void display() {
        if (this.quantity <= 0){
            System.out.print("[" + id + ", " + name + ", ");
            System.out.format("%.2f", price);
            System.out.println(", " + "Out of stock" + ", " + insurance + "]");
        }else {
            System.out.print("[" + id + ", " + name + ", ");
            System.out.format("%.2f", price);
            System.out.println(", " + quantity + ", " + insurance + "]");
        }
        
    }
}
