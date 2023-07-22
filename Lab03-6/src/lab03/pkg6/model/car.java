/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg6.model;

/**
 *
 * @author nguye
 */
public class car {
    protected String Colour;
    protected Integer EnginePower;
    protected Boolean Convertible;
    protected Boolean ParkingBrake;

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public Integer getEnginePower() {
        return EnginePower;
    }

    public void setEnginePower(Integer EnginePower) {
        this.EnginePower = EnginePower;
    }

    public Boolean getConvertible() {
        return Convertible;
    }

    public void setConvertible(Boolean Convertible) {
        this.Convertible = Convertible;
    }

    public Boolean getParkingBrake() {
        return ParkingBrake;
    }

    public void setParkingBrake(Boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }

    public car(String Colour, Integer EnginePower, Boolean Convertible, Boolean ParkingBrake) {
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }
    
    public car(){
        
    }
    
    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }
    
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");
    }
    
    public String output() {
        return "car{" + "Colour=" + Colour + ", EnginePower=" + EnginePower + ", Convertible=" + Convertible + ", ParkingBrake=" + ParkingBrake + '}';
    }
    
    
}
