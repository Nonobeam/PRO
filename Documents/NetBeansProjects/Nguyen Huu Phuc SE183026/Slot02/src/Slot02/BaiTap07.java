/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slot02;

import java.util.Scanner;

/**
 *
 * @author BakaUni
 */
public class BaiTap07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap so nguyen:");
        
        int n = Integer.parseInt(sc.nextLine());
        int sodu = n & 5;
        
        switch(sodu){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            default:
                System.out.println("So nhap khong hop le");
                break;
        }
        
        System.out.println("Ket thuc chuong trinh7");
                
        
    }
}
