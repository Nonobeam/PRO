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
public class Statue extends Item {
    private int weight;
    private String colour;
    
    public Statue(){
    
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void inputSatue(){
        Scanner sc = new Scanner(System.in);
        
        input();
        System.out.print("Enter the weight: ");
        setWeight(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter the colour: ");
        setColour(sc.nextLine());
    }
    
    public void outputSatue(){
        output();
        System.out.format("Weight: %d\n", this.weight);
        System.out.format("Colour: %s\n", this.colour);
    }
    
}
