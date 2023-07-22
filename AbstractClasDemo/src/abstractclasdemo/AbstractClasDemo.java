/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasdemo;

import abstractclasdemo.model.*;
/**
 *
 * @author USER
 */
public class AbstractClasDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee s1 = new Simple("s01", "An", 2000, 2015);
        s1.display();
        
        System.out.println("\n");
        
        Employee s2 = new Manager(1.5, "m01", "Duy", 1995, 2010);
        s2.display();
    }
    
}
