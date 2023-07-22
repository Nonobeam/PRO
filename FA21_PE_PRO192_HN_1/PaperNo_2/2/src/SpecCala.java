/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class SpecCala extends Cala{
    protected int color;

    public SpecCala() {
        
    }

    public SpecCala(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }


    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setData(){
        String sub = owner;
        owner = sub.substring(0, 1) + "XX" + sub.substring(2);
    }
    
    public int getValue(){
        int ans;
        if(color % 2 == 0){
            ans = price + 7;
        }else{
            ans = price + 3;
        }
        return ans;
    }

    @Override
    public String toString() {
        return owner + ", " + price + ", " + color;
    }

}
