/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

/**
 *
 * @author BakaUni
 */
public class Tester {

    public static void main(String[] args) {
        String s = new String("Nguyen Huu Phuc");
        String s1 = "Huu Phuc";
        String s2 = "Nguyen Huu Phuc";
        
        String re3 = s.equals();
       
        int rs4 = s.compareTo("nguyen huu phuc");
        System.out.format("rs4: %d \n", rs4);
        
        String [] rs5 = s.split(" ");
        for (String tmp : rs5) {
            System.out.format("rs5: %s \n",tmp);
        }
        
        char[] myarray = s.toCharArray();
        for (int i = 0; i < myarray.length; i++) {
            System.out.print(myarray[i]);
            System.out.print(" ");
        }
    }
    
}
