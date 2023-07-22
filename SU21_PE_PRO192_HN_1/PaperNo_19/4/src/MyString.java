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
        String[] myString = str.split(" ");
        
        for(String x : myString){
            if(x.endsWith("m") || x.endsWith("n")){
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String ans = "";
        
        String[] myString = str.split(" ");
        
        String max = "";
        int index = 0;
        for(int i = 0; i < myString.length; i++){
            if(myString[i].length() > max.length()){
                max = myString[i];
                index = i;
            }
        }
        
        char ch;
        String nstr = "";
        for(int i = 0; i < max.length(); i++){
            ch = max.charAt(i);
            nstr = ch + nstr;
        }
        
        for(int i = 0; i < myString.length; i++){
            if(i == index){
                ans += nstr + " ";
            }else{
                ans += myString[i] + " ";
            }
        }
        
        return ans;
    }
    
}
