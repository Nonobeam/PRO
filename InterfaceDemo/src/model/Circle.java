package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class Circle implements IShape2D{
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public Circle(){
        
    }
    
    public Circle(int r){
        this.radius = radius;
    }
    
    @Override
    public double perimeter(){
        return radius * 2 * Math.PI;
    }
    
    @Override
    public double area(){
        return radius * radius * Math.PI;
    }
}
