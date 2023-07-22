/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class SimpleAccount extends Account implements IBank{
    protected String type;
    
    public SimpleAccount(){
        
    }

    public SimpleAccount(String type, String id, String name, double balance){
        super(id, name, balance);
        this.type = "1";
    }
    
    @Override
    public void depositAtDesk(double a){
        if (a >= 0 && a < 10000){
            balance = balance + a;
        }
    }
    
    @Override
    public void withDrawAtDesk(double a){
        if (a >= 0 && a < 1000){
            if (balance - a - 5.0 >= 5.0){
                balance = balance - a - 5.0;
            }
        }
    }

    @Override
    public String toString() {
        return "TP BANK: Simple acocunt type = " + type + ", id = " + id + ", name = " + name;
    }
    
}
