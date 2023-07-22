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
public class Box extends Rectangle implements IShape3D{
    double heigth;

    public Box(double width, double length, double heigth) {
        super(width, length);
        this.heigth = heigth;
    }
    
    @Override
    public double perimenter(){
        return (width + length) * 2;
    }
    
    @Override
    public double area(){
        return width * length;
    }
    
    @Override
    public double vol(){
        return width * length * heigth;
    }
}
