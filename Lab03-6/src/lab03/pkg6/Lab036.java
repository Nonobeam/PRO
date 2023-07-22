/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg6;

import lab03.pkg6.model.car;

/**
 *
 * @author nguye
 */
public class Lab036 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        car c = new car();
        c.pressStartButton();
        c.pressAcceleratorButton();
        c.output();
        
        car c2 = new car("red", 100, true, true);
        c2.pressAcceleratorButton();
        c2.setColour("Black");
        System.out.println("Colour of c2:" + c2.getColour());
        c2.output();
    }
    
}
