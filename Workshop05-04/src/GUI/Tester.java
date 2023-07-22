/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.*;
/**
 *
 * @author USER
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Colony obj1 = new BeeColony(2000, "honey", "land");
        System.out.println("obj1: " + obj1);
        obj1.grow();
        obj1.reproduce();
        
        System.out.println("\n");
        
        University obj2 = new FPTUniversity(100000, "FPT", "CanTho");
        System.out.println("obj2: " + obj2);
        obj2.enroll();
        obj2.educate();
        
        System.out.println("\n");
        
        Role df = new BeeColony(3000, "Wasp", "Land");
        System.out.println("df1: " + df);
        df.createWorker();
        
        System.out.println("\n");
        
        df = new FPTUniversity(100000, "FPT", "Hanoi");
        System.out.println("df2: " + df);
        df.createWorker();
    }
    
}
