/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasdemo.model;

import java.time.Year;

/**
 *
 * @author USER
 */
public class Simple extends Employee{
    

    public Simple(String code, String name, int birthYear, int hiredYear) {
        super(code, name, birthYear, hiredYear);
    }
    
    
    @Override
    public double salary(){
        Year date = Year.now();
        return (date.getValue() - super.hiredYear) * 1200000;
    }
}
