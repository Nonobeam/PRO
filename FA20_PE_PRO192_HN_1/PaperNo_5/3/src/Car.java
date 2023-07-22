
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
public class Car implements Comparable{
    protected String maker;
    protected int rate;
    
    public Car(){
        
    }

    public Car(String maker, int rate) {
        this.maker = maker;
        this.rate = rate;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    
    public static Comparator compCar = new Comparator(){
        @Override
        public int compare(Object o1, Object o2) {
            Car subCar1 = (Car)o1;
            Car subCar2 = (Car)o2;
            int makerCompare = subCar1.getMaker().compareTo(subCar2.getMaker());
            if(makerCompare != 0){
                return makerCompare;
            }
            return Integer.compare(subCar2.getRate(), subCar1.getRate());
        }  
    };
    
    @Override
    public int compareTo(Object stu1){
        Car car = (Car)stu1;
        if (this.getRate() > car.getRate()){
            return 1;
        }
        else if(this.getRate() == car.getRate()){
            return 0;
        }
        else{
            return -1;
        }
    }
    
}
