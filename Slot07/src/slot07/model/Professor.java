/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot07.model;

/**
 *
 * @author nguye
 */
public class Professor extends Person {
    private String department;

    public Professor() {
    }

    public Professor(String name, String address, String birthDate, String idNumber,String department) {
        super(name, address, birthDate, idNumber);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    
   
}
