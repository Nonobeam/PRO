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
public class BaiTap04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hay nhap 2 so nguyeyn x va y");
        
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        
        double s = 1.0/x + 1/(double)y;
        
        System.out.format("Tong nghich dao s = %.2f \n", s);
    }
}
