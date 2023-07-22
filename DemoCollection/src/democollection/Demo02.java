/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollection;

import java.util.Vector;

/**
 *
 * @author USER
 */
public class Demo02 {
    public static void main(String[] args) {
        // TODO code application logic here
        Vector <String> vS = new Vector<String>();
        vS.add("Hello");
        vS.add("FPT");
        vS.add("FPTU HCM");
        vS.add("FSoft");
        vS.add("FIS = FPT INFORMATION SYSTEM");
        vS.add("Hello FIS HCM");
        
        System.out.println("Cau 1");
        for(Object a : vS){
            System.out.println(a);
        }
        
        System.out.println("Cau 2");
        for(Object a : vS){
            if (a == "FPT") System.out.println(a);
        }
        
        System.out.println("Cau 3");
        int count = 0;
        for(int i = 0;  i < vS.size(); i++){
            if(vS.get(i).matches("FPT") || vS.get(i).matches("(.*)FPT(.*)")){
                System.out.println(vS.get(i));
                count++;
            }
        }
        System.out.println(count);
        
        System.out.println("Cau 4");
        for (int i = 0; i < vS.size(); i++) {
            String[] s = vS.get(i).split(" ");
            if(s.length == 2){
                System.out.println(vS.get(i));
            }
        }
        
        System.out.println("Cau 5");
        for (int i = 0; i < vS.size(); i++) {
            System.out.println(vS.get(i).substring(0, 2));
        }
    }
}
