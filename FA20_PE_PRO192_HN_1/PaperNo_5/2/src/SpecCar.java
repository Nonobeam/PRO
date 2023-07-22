/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class SpecCar extends Car{
    private int type;

    public SpecCar() {
        
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }
    
    public void setData(){
        maker = "XZ" + maker;
        price += 20;
    }
    
    public int getValue(){
        int inc;
        
        if(type < 7){
            inc = 10;
        }else{
            inc = 15;
        }
        
        return price + inc;
    }

    @Override
    public String toString() {
        return maker + ", " + price + ", " + type;
    }

}
