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
public class Part5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        double x;
        double n;
        
        x = Double.parseDouble(sc.nextLine());
        n = Double.parseDouble(sc.nextLine());
        
        if (n <= 0){
            System.out.println("Wrong num type for n");
        }else{
            System.out.println(Math.pow(x, n));
        }
        
        
        
    }
}
