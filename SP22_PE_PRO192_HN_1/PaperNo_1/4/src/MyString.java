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

    @Override
    public int f1(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                int sub = Character.getNumericValue(str.charAt(i));
                if(sub % 2 != 0){
                    count += sub;
                }
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] myString = str.split(" ");
        
        String ans = "";
        int max = myString[0].length(), len = 0;
        int index = 0;
        for(int i = 0; i < myString.length; i++){
            len = myString[i].length();
            if (len > max){
                max = len;
                index = i;
            }
        }
        
        System.out.println(index);
        for(int i = 0; i < myString.length; i++){
            if (i != index){
                ans = ans + myString[i] + " ";
            }
        }
        
        ans += myString[index];
        
        return ans;
    }
    
}
