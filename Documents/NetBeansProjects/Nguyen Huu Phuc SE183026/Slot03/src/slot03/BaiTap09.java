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
public class BaiTap09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        String myString;
        myString = sc.nextLine();
        
        boolean check = myString.matches("^E\\d{3}$");
        
        if (check == true){
            System.out.println("Dung dinh dang");
        }else{
            System.out.println("Sai dinh dang");
        }
        
        System.out.println("Ket thuc chuong trinh");
        
    }
}
