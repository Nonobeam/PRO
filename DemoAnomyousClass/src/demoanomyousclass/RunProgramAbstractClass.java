/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoanomyousclass;

import DTO.MyAbstractClass;

/**
 *
 * @author USER
 */
public class RunProgramAbstractClass {
    public static void main(String[] args) {
        MyAbstractClass obj = new MyAbstractClass(){
            @Override
            public void M1(){
                System.out.println("M1 of child");
            }
        };
        
        obj.M1();
    }
}
