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
public class BaiTap02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hay nhap so nguyen");
        int n = Integer.parseInt(sc.nextLine());
        
        System.out.format("So nguyen vua nhap: %d\n", n);
        System.out.println("Ket thuc chuong trinh");
    }
    
}
