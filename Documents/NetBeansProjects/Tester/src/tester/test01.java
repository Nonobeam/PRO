/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.util.Scanner;

/**
 *
 * @author BakaUni
 */
public class test01 {
    public static void main(String[] args) {
        String mystring = "SE18:FPT:DAIHOC";
        
        String [] s = mystring.split(":");
        
        for(String a : s){
            System.out.println(a);
        }
    }
}
