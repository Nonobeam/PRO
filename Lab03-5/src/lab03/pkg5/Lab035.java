/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg5;

import java.util.Scanner;
import lab03.pkg5.model.MyFraction;

/**
 *
 * @author nguye
 */
public class Lab035 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tuSo = Integer.parseInt(sc.nextLine());
        int mauSo = Integer.parseInt(sc.nextLine());
        MyFraction fraction1 = new MyFraction(tuSo, mauSo);
        
        System.out.println("Nhap phan so thu 2");
        MyFraction fraction2 = new MyFraction(tuSo, mauSo);
        int tuSo2 = Integer.parseInt(sc.nextLine());
        int mauSo2 = Integer.parseInt(sc.nextLine());    
        
        fraction2.setMauSo(mauSo2);
        fraction2.setTuSo(tuSo2);
        
        System.out.println("Tong 2 cai: " + fraction1.tongPs(fraction2));
        
        
    }
    
}
