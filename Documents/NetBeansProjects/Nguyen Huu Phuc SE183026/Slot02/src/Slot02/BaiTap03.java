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
public class BaiTap03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x, y;
        
        System.out.println("Nhap x va y:");
        
        x = Integer.parseInt(sc.nextLine());
        y = Integer.parseInt(sc.nextLine());
        
        int Sum = x + y;
        
        System.out.format("Ket qua tong: %d va hieu: %d", Sum, x - y);
        System.out.format("Ket qua tich: %d va thuong: %d", x*y, x/y);
    }
    
}
