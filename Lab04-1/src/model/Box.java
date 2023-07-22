/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nguye
 */
public class Box extends Rectangle{
    private double height;

    public Box(double heigthj) {
    }

    public Box(double height, double width, double length) {
        super(width, length);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double vol(){
        return getWidth() * getLength() * height;
    }
}
