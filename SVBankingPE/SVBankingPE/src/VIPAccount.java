/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class VIPAccount extends Account implements IBank, IUselPay{
    
    public VIPAccount(){
        
    }
    
    public VIPAccount(String id, String name, double balance){
        super(id, name, balance);
    }
    
    @Override
    public void withDrawAtDesk(double x){
        if (balance - x - 1.0 >= 5.0){
            balance = balance - x - 1.0;
        }
    }
    
    @Override
    public void depositAtDesk(double x){
        balance = balance + x;
    }
    
    @Override
    public double checkBalance(){
        return balance - 1.0;
    }
    
    @Override
    public void internetBanking(double x){
        System.out.println("Internet banking delegates for desk helper");
        if (x >= 0){
            depositAtDesk(x);
        }else{
            withDrawAtDesk(x);
        }
    }
    
    
    @Override
    public void iPay(double x){
        System.out.println("iPay delegates for internet service helper");
        internetBanking(x);
    }

    @Override
    public String toString() {
        return "TP BANK: " + today + ", VIP ACCOUNT, id = " + id + ", name = " + name + ", balance = " + balance;
    }
    
}
