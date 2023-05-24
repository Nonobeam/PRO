/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2;

import java.util.Scanner;

/**
 *
 * @author BakaUni
 */
public class Part4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap cac so thu x va y va z \n");
        
        float x, y, z;
        x = Integer.parseInt(sc.nextLine());
        y = Integer.parseInt(sc.nextLine());
        z = Integer.parseInt(sc.nextLine());
        
        System.out.println("Ket qua \n");
        System.out.format("%.2f + %.2f + %.2f = %.2f \n", x, y, z, x + y + z);
        System.out.format("%.2f - %.2f - %.2f = %.2f \n", z, y, x, z - y - x);
        System.out.format("%.2f + %.2f * %.2f = %.2f \n", y, z, x, y + z * x);
        System.out.format("%.2f / %.2f / %.2f = %.2f \n", z, y, x, z / y / x);
        System.out.format("%.2f - %.2f = %.2f va %.2f + %.2f = %.2f \n", x, y, x - y, y, z, y + z);
    }
}
