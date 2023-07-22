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
public class Sphere implements IShape3D, IShape2D{
    double radius;
    int x, y, z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public Sphere(int r){
        this.radius = radius;
    }

    public Sphere(double radius, int x, int y, int z) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    @Override
    public double vol(){
        return 4/3 *radius * radius * Math.PI;
    }
    
    @Override
    public double area(){
        return radius * radius * Math.PI;
    }
    
    @Override
    public double perimenter(){
        return radius * 2 * Math.PI;
    }
}
