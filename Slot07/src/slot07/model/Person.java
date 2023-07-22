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
public class Person {
    protected String name;
    protected String address;
    protected String birthDate;
    protected String idNumber;

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Person(){
        
    }
    
    public Person(String name, String address, String birthDate, String idNumber) {
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.idNumber = idNumber;
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
    
    @Override
    public String toString(){
        return "Ten: " + name + "Dia chi nha: " + address + "Ngay sinh: " + birthDate + "\nID:" + idNumber;
    }
    
    public void doWork(){
        System.out.println("Lam viec");
    }
}
