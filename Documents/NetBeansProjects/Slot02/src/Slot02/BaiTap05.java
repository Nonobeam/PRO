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
public class BaiTap05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        
        if(n%2 == 0){
            System.out.println("So chan");
        }else{
            System.out.println("So le");
        }
        
        System.out.println("Ket thuc chuong trinh");
    }
}
