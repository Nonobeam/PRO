/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USER
 */
public class Rectangle implements IShape2D{
    double width;
    double length;
    
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    
    @Override
    public double perimenter(){
        return (width + length) * 2;
    }
    
    @Override
    public double area(){
        return width * length;
    }
}
