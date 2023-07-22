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
public abstract class Employee {
    protected String code;
    protected String name;
    protected int birthYear;
    protected int hiredYear;
    protected int age;

    public Employee(){
        
    }
    
    public Employee(String code, String name, int birthYear, int hiredYear) {
        this.code = code;
        this.name = name;
        this.birthYear = birthYear;
        this.hiredYear = hiredYear;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getHiredYear() {
        return hiredYear;
    }

    public void setHiredYear(int hiredYear) {
        this.hiredYear = hiredYear;
    }
    
    public abstract double salary();
    
    public int age(){
        Year date = Year.now();  
        return date.getValue() - birthYear;
    }
            
    public void display(){
        System.out.format("Code: %s\nTen: %s\nTuoi: %d\nSalary: %s", code, name, age(), salary());
    }
}
