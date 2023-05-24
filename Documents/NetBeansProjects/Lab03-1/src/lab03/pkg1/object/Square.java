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
public class Square {
    private double width;
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public Square(){
        
    }
    
    public Square(double width, double length) {
        this.width = width;
    }
    
    public double getWidth() {
        return width;
    }
    
    public static Double Area(double width){
        double result;
        result = width * width;
        return result;
    }
    
    public static Double Perimenter(double width){
        double result;
        result = width * 4;
        return result;
    }
}
