/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author USER
 */
public class FPTUniversity extends University implements Role{
    private String address;
    
    public FPTUniversity(){
        
    }
    
    public FPTUniversity(int size, String place, String address){
        super(size, place);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void createWorker(){
        System.out.println("Providing human resources");
    }
    
    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }
}
