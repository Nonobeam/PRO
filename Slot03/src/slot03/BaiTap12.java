/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot03;

import java.util.Scanner;

/**
 *
 * @author BakaUni
 */
public class BaiTap12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;;
        
        for (int i = 0; i <= n; i++){
            sum+=i;
        }
        
        System.out.format("Tong la : %d \n", sum);
    }
}
