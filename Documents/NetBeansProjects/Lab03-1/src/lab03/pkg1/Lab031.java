/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg1;

/**
 *
 * @author BakaUni
 */
import lab03.pkg1.object.*;

public class Lab031 {
    public static void main(String[] args) {
        Rectangle hcn = new Rectangle();
        Triangle htg = new Triangle();
        Square hv = new Square();
        
        hcn.setWidth(5);
        hcn.setLength(10);
        
        System.out.format("Chieu rong: %.2f chieu dai:  %.2f chu vi: %.2f dien tich: %.2f \n", hcn.getWidth(), hcn.getWidth(), hcn.Perimenter(), hcn.Area());
        
    }

    
    
}
