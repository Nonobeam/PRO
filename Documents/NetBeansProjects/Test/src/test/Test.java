/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author BakaUni
 */
public class Test {
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        
        String [] a = s.split("-");
        
        for (String i : a) {
            System.out.println(i);
        }
    }
}
