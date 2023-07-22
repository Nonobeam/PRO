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
public class Vase extends Item{
    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int value, String creator, int heigth, String material) {
        super(value, creator);
        this.height = heigth;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void inputVase(){
        Scanner sc = new Scanner(System.in);

        input();
        System.out.print("Enter the height: ");
        setHeight(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter the Material: ");
        setMaterial(sc.nextLine());
    }
    
    public void outputVase(){
        output();
        System.out.format("Height: %d\n", this.height);
        System.out.format("Material: %s\n", this.material);
    }
}
