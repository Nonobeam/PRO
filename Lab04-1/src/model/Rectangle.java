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
public class Rectangle {
    protected double width;
    protected double length;
    
    public Rectangle(){
        
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double perimenter(){
        return (width + length) * 2;
    }
    
    public double area(){
        return width * length;
    }
}
