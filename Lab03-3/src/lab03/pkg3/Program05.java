/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg3;

import java.util.Scanner;
import lab03.pkg3.models.Employee;

/**
 *
 * @author nguye
 */
public class Program05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Employee employee = new Employee();
        
        employee.setCode(Integer.parseInt(sc.nextLine()));
        employee.setName(sc.nextLine());
        employee.setYearBirth(Integer.parseInt(sc.nextLine()));
        employee.setSalary(Integer.parseInt(sc.nextLine()));
        
        System.out.format("Ma so:%d \nTen:%s \nTuoi:%d \nThu nhap:%d \n", employee.getCode(), employee.getName(), employee.getAge(), employee.getIncome());
                
                
                
    }
}
