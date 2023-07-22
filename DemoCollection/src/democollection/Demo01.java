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
public class Demo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector v = new Vector();
        v.add(100);
        v.add("Hello");
        v.add(25.75);
        v.add('a');
        v.add(250);
        
        System.out.format("So luong phan tu trong v = %d \n", v.size());
        
        System.out.format("Phan tu tai vi tri index = 2 la: %f \n", v.get(2));
        
        v.set(2, 50.5);
        
        System.out.format("Phan tu tai vi tri index = 2 sai khi thay doi la: %f \n", v.get(2));
        
        v.remove(2);
        
        System.out.format("So luong phan tu trong v = %d \n", v.size());
        
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        
        for(Object a : v){
            System.out.println(a);
        }
    }
    
}
