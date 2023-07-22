/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg4;

import java.util.Scanner;
import lab03.pkg4.model.Circle;

/**
 *
 * @author nguye
 */
public class Program06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double bk = Double.parseDouble(sc.nextLine());
        String colour = sc.nextLine();
        
        Circle circle = new Circle(bk, colour);
        circle.setRadius(bk);
        circle.setColor(colour);
        
        System.out.println(circle);
    }
    
}
