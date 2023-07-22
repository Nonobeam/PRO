
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class MyCar implements ICar{

    @Override
    public int f1(List<Car> t) {
        float averageRate = 0;
        int sum = 0;
        
        for(Car x : t){
            sum += x.getRate();
        }
        
        averageRate = sum / t.size();
        int ans = (int)averageRate;
        
        return ans;
    }

    @Override
    public void f2(List<Car> t) {
        int maxRate = t.get(0).getRate();
        int minRate = t.get(0).getRate();
        int min = 0;
        int max = 0;
        for(int i = 0; i < t.size(); i++){

            if (t.get(i).getRate() > maxRate){
                maxRate = t.get(i).getRate();
                max = i;
            }   
            if (t.get(i).getRate() < minRate){
                minRate = t.get(i).getRate();
                min = i;
            }
        }
        Collections.swap(t, max, min);
    }

    @Override
    public void f3(List<Car> t) {
        Collections.sort(t, Car.compCar);
    }
    
    
}
