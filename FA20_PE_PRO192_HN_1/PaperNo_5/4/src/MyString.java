/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class MyString implements IString{
    
    public static boolean isPrime(String s){
        int number = Integer.parseInt(s);
        
        if(number <= 1) return false;
        
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public int f1(String str) {
        int count = 0;
        String subString = "";
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                subString += c;
                if(isPrime(subString)){
                    count++;
                }
                subString = "";
            }
        }
        
        return count;
    }

    @Override
    public String f2(String str) {
        String[] subString = str.split(" ");
        String ans = "";
        
        for(int i = subString.length - 1; i >= 0; i--){
            ans += subString[i] + " ";
        }
        return ans;
    }
    
}
