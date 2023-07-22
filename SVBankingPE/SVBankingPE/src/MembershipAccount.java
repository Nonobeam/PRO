/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class MembershipAccount extends SimpleAccount implements IService{
    
    public MembershipAccount(){
        
    }
    
    public MembershipAccount(String type, String id, String name, double balance){
        super(type, id, name, balance);
        this.type = "2";
    }
    
    @Override
    public double checkBalance(){
        balance -= 5.0;
        return balance;
    }

    @Override
    public String toString() {
        return "TP BANK: " + today + ", Membership account type = " + type + ", id = " + id + ", name = " + name + ", balance = " + balance;
    }
    
}
