/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04.pkg1;

import model.Box;
import model.Rectangle;

/**
 *
 * @author nguye
 */
public class Lab041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle hcn1 = new Rectangle(5, 10);
        System.out.format("CR = %.2f CD = %.2f CV = %.2f DT = %.2f", hcn1.getWidth(), hcn1.getLength(), hcn1.perimenter(), hcn1.area());
        System.out.println("");
        
        Box hh1 = new Box(2,4,10);
        System.out.format("CR = %.2f CD = %.2f CV = %.2f DT = %.2f TT = %.2f", hh1.getWidth(), hh1.getLength(), hh1.getHeight(),hcn1.perimenter(), hcn1.area(), hh1.vol());
    }
    
}
