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
public class Triangle {

    private double a;
    private double b;
    private double c;
    
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public Triangle(){
        
    }
    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public static Double Area(double a, double b, double c){
        double result;
        double p = Perimenter(a, b, c) / 2;
        result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return result;
    }
    
    public static Double Perimenter(double a, double b, double c){
        double result;
        result = a + b + c;
        return result;
    }
    
}
