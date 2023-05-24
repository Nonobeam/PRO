/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg1;

import lab03.pkg1.object.Rectangle;

/**
 *
 * @author BakaUni
 */
public class Lab032 {
    public static void main(String[] args) {
        Rectangle hcn2 = new Rectangle(10, 20);
        
        System.out.format("Chieu rong: %.2f chieu dai:  %.2f chu vi: %.2f dien tich: %.2f \n", hcn2.getWidth(), hcn2.getWidth(), hcn2.Perimenter(), hcn2.Area());
    }
}
