
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Cala implements Comparable{
    protected String owner;
    protected int price;
    
    public Cala(){
        
    }

    public Cala(String owner, int price) {
        this.owner = owner;
        this.price = price;
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    @Override
    public int compareTo(Object stu1){
        Cala stu = (Cala)stu1;
        if (this.getPrice() > stu.getPrice()){
            return 1;
        }
        else if(this.getPrice() == stu.getPrice()){
            return 0;
        }
        else{
            return -1;
        }
    }
}
