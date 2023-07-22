/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg5.model;

/**
 *
 * @author nguye
 */
public class MyFraction {
    
    int tuSo;
    int mauSo;

    public MyFraction(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public MyFraction(){
        
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    
    public MyFraction tongPs(MyFraction fraction){   
        MyFraction result = new MyFraction();
        int mauSoMoi = fraction.mauSo * this.mauSo;
        int tuSoMoi = fraction.mauSo * this.tuSo + fraction.tuSo * this.mauSo;

        result.setTuSo(tuSoMoi);
        result.setMauSo(mauSoMoi);
        return result;
    }
    
    
    @Override
    public String toString(){
        return tuSo + "/" + mauSo;
    }
        
}
