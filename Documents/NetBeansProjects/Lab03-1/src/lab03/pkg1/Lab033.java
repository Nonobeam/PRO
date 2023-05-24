/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg1;

import java.util.Scanner;
import lab03.pkg1.object.Rectangle;

/**
 *
 * @author BakaUni
 */
public class Lab033 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap chieu rong va chieu dai: ");
        double cr = Double.parseDouble(sc.nextLine());
        double cd = Double.parseDouble(sc.nextLine());
        
        Rectangle x = new Rectangle(cr, cd);
        
        System.out.format("Chieu rong: %.2f chieu dai:  %.2f chu vi: %.2f dien tich: %.2f \n", x.getWidth(), x.getWidth(), x.Perimenter(), x.Area());
        
    }
}
