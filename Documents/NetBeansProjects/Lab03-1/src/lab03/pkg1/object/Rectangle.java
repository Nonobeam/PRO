/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg1.object;

/**
 *
 * @author BakaUni
 */
public class Rectangle {

    private double width;
    private double length;
    
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
     
    public Double Area(){
        double result;
        result = width * length;
        return result;
    }
    
    public Double Perimenter(){
        double result;
        result = (width + length) * 2;
        return result;
    }
    
}
