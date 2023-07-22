/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot03;

/**
 *
 * @author BakaUni
 */
public class BaiTap11 {
    public static void main(String[] args) {
        int n = 5;
        
        int sum = 0;
        int i = 0;
        
        while(i <= n){
            sum+=i;
            i++;
        }
        System.out.format("Tong la: %d \n", sum);
        
        System.out.println("ket thuc chuong trinh");
    }
}
