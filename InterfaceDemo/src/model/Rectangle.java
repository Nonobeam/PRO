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
public class Rectangle implements IShape2D {
    double length;
    double width;
   

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double perimeter(){
        return (length + width) * 2;
    }
    
    @Override
    public double area(){
        return length * width;
    }
}
