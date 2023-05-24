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
public class BaiTap06 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Nhap vao so nguyen to:");
            
            int n = Integer.parseInt(sc.nextLine());
            
            if (n == 1 || n == 2 || n == 3){
                System.out.println("Quy 1");
            }else if (n == 4 || n == 5 || n == 6){
                System.out.println("Quy 2");
            }else if (n == 7 || n == 8 || n == 9){
                System.out.println("Quy 3");
            }else if (n == 10 || n == 11 || n == 12){
                System.out.println("Quy 4");
            }else{
                System.out.println("Nhap sai so");
            }
            
            System.out.println("Ket thuc chuong trinh");
    }
}
