
package tester;

import java.util.Scanner;

public class Tester3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s;
        System.out.println("Enter a String: ");
        s = sc.nextLine();
        
        String rs[] = s.split(" ");
        for (String tmp : rs) {
            char arr[] = tmp.toCharArray();
            for(int i = 0; i < arr.length; i++){
                if (i == 0){
                    char arr1 = arr[i];
                    char arr2;
                    arr2 = Character.toUpperCase(arr1);
                    System.out.print(arr2);
                }else{
                    System.out.print(arr[i]);
                }
            }
            System.out.print(" ");
        }
    }
 
}
