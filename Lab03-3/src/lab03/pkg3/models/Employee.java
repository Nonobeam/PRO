/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg3.models;

import java.util.Calendar;  
/**
 *
 * @author nguye
 */
public class Employee {
    private Integer code;
    private Integer yearBirth;
    private Integer age;
    private String name;
    private Integer salary;
    private Integer income;

    Calendar calendar = Calendar.getInstance();  
    int year = calendar.get(Calendar.YEAR); 
    
    public void setCode(Integer code) {
        this.code = code;
    }

    public void setYearBirth(Integer yearBirth) {
        this.yearBirth = yearBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getCode() {
        return code;
    }

    public Integer getYearBirth() {
        return yearBirth;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getAge(){
        return year - yearBirth;
    }
    
    public Integer getIncome() {
        int totalIncome = salary * 12;
        return totalIncome;
    }

    public Employee(Integer code, Integer yearBirth, String name, Integer salary, Integer income) {
        this.code = code;
        this.yearBirth = yearBirth;
        this.name = name;
        this.salary = salary;
        this.income = income;
    }
    
    public Employee(){
    
    }
}
