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
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void inputPainting(){
        Scanner sc = new Scanner(System.in);

        input();
        System.out.print("Enter the height: ");
        setHeight(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter the width: ");
        setWidth(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter the Water Colour: ");
        setIsWatercolour(Boolean.parseBoolean(sc.nextLine()));
        System.out.print("Enter the Frame: ");
        setIsFramed(Boolean.parseBoolean(sc.nextLine()));
    }
    
    public void outputPainting(){
        output();
        System.out.format("Height: %d\n", height);
        System.out.format("Width: %d\n", width);
        if (isWatercolour){
            System.out.println("The painting is coloured");
        }
        if (isFramed){
            System.out.println("The painting is framed");
        }
    }
}
