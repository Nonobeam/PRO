/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo;

import model.*;
/**
 *
 * @author USER
 */
public class InterfaceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IShape2D r = new Rectangle(5, 10);
        System.out.format("Rectangle: cv = %.2f, dt = %.2f \n", r.perimeter(), r.area());
        
        IShape2D c = new Circle();
        ((Circle)c).setRadius(2);
        System.out.format("Circle: cv = %.2f, dt = %.2f \n", c.perimeter(), c.area());
        
    }
    
}
