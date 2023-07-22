/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg4.model;

/**
 *
 * @author nguye
 */
public class Circle {
    private double radius;
    private String color;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public Double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    
    public Double getPerimenter(){
        return Math.PI * radius * 2;
    }
    
    @Override
    public String toString(){
        
        System.out.format("Radius: %.2f\nColor: %s\nArea: %.2f\nPerimenter: %.2f", radius, color, getArea(), getPerimenter());
        return "";
    }
    
}
