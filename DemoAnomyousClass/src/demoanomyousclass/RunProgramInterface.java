/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoanomyousclass;

import DTO.MyInterface;

/**
 *
 * @author USER
 */
public class RunProgramInterface {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface(){            
            @Override
            public void M3(){
                System.out.println("M3");
            }
            
            @Override
            public void M4(){
                System.out.println("M4");
            }
        };
        
        obj.M3();
        obj.M4();
    }
}
