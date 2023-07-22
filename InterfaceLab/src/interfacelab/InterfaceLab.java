/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelab;

import model.*;
/**
 *
 * @author USER
 */
public class InterfaceLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box b = new Box(2, 5, 10);
        System.out.println(b.vol());
        
        IShape2D b1 = new Box(4, 5, 10);
        System.out.println(((IShape3D)b1).vol());
        
        IShape3D b2 = new Box(10, 20, 40);
        System.out.println(((IShape2D)b2).area());
        
        Sphere s = new Sphere(5.5, 0, 0, 0);
        System.out.println(s.vol());
        
        IShape2D s1 = new Sphere(4, 1, 1, 1);
        System.out.println(((IShape3D)s1).vol());
        
        IShape3D s2 = new Sphere(10, 0, 0, 0);
        System.out.println(((IShape2D)s2).area());
    }
    
}
