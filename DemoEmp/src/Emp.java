/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.time.Year;
import java.util.Comparator;

/**
 *
 * @author USER
 */
public class Emp implements Comparable{
    protected String code;
    protected String name;
    protected double salary;
    //true is Male and false is Female
    protected boolean gender;
    protected int birthyear;
    
    public Emp(){
        
    }

    public Emp(String code, String name, double salary, int birthyear, boolean gender) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.birthyear = birthyear;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }
    
    public int age(){
        Year date = Year.now();  
        return date.getValue() - birthyear;
    }
    
    public static Comparator compSalary = new Comparator(){  
        @Override
        public int compare(Object empS1, Object empS2){
            Emp stu1 = (Emp)empS1;
            Emp stu2 = (Emp)empS2;
            if(stu1.getSalary() < stu2.getSalary()){
                return 1;
            }else if(stu1.getSalary() == stu2.getSalary()){
                return 0;
            }else{
                return -1;
            }
        }
    };
    
    @Override
    public int compareTo(Object emp1){
        Emp emp = (Emp)emp1;
        if (this.age() > emp.age()){
            return 1;
        }
        else if(this.age() == emp.age()){
            return 0;
        }
        else{
            return -1;
        }
    }

    @Override
    public String toString() {
        if (this.gender == true){
            return "[" + code + ", " + name + ", Male" + ", " + age() + ", " + salary + ']';
        }else{
            return "[" + code + ", " + name + ", Female" + ", " + age() + ", " + salary + ']';
        }
        
    }
       
}
