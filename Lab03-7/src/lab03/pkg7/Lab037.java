/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg7;

import model.guitar;

/**
 *
 * @author nguye
 */
public class Lab037 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        guitar obj1 = new guitar();
        guitar obj2 = new guitar("G123", 2000, "Sony", "Model123", "hardWood", "softWood");
        System.out.println("State of obj1:");
        obj1.createSound();
        System.out.println("State of obj2:");
        obj2.createSound();
        
        System.out.println("Set price = 3000 of obj1");
        obj1.setPrice(3000);
        System.out.println("Get price of obj1:" + obj1.getPrice());
    }
    
}
