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
public class Manager extends Employee {
    protected double extra;
    
    public Manager(double extra, String code, String name, int birthYear, int hiredYear){
        super(code, name, birthYear, hiredYear);
        this.extra = extra;
    }

    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }
    
    @Override
    public double salary(){
        Year date = Year.now();
        return (date.getValue() - hiredYear + extra) * 1250000;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("\nExtra: " + extra);
    }
}
