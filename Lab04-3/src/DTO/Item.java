/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Item {
//    protected int value;
//    protected String creator;
//    
//    public Item(){
//    
//    }
//    
//    public Item(int value, String creator) {
//        this.value = value;
//        this.creator = creator;
//    }
//
//    public int getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//
//    public String getCreator() {
//        return creator;
//    }
//
//    public void setCreator(String creator) {
//        this.creator = creator;
//    }
//    
//    public void input(){
//        Scanner sc = new Scanner(System.in);
//        
//        while (true) {
//            try {
//                System.out.print("Enter the value: ");
//                value = Integer.parseInt(sc.nextLine());
//                
//                System.out.print("Enter the creator: ");
//                creator = sc.nextLine();
//
//                if (value <= 0 || creator.isEmpty()) {
//                    throw new IllegalArgumentException("Value must be greater than zero and creator must not be null");
//                }else{
//                    setValue(value);
//                    setCreator(creator);
//                }
//
//                break; // Exit the loop if the value is valid
//            } catch (IllegalArgumentException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//   
//    }
//    
//    public void output(){
//        System.out.format("Value: %d\n", this.value);
//        System.out.format("Creator: %s\n", this.creator);
//    }
    
    protected String creator;
    protected int value;
    
    public Item(){
       
    }

    public Item(int value, String creator) {
        this.creator = creator;
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            try{
                System.out.println("Enter your value: ");
                value = Integer.parseInt(sc.nextLine());
                System.out.println("Enter your creator: ");
                creator = sc.nextLine();
                
                if (value <= 0 || creator.isEmpty()){
                    throw new IllegalArgumentException("The input value must be greater than 0 and the creator must not be null");
                }else{
                    setValue(value);
                    setCreator(creator);
                    break;
                }
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void output(){
        System.out.format("Value is: %d\n", this.value);
        System.out.format("Creator is: %s\n", this.creator);
    }
}
