
import java.util.ArrayList;
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
public class MyCala implements ICala{

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for(Cala x : t){
            char ch = x.getOwner().charAt(1);
            if(Character.isDigit(ch)){
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        if(t.size() - 1 == 0) return;
        
        List<Cala> t2 = new ArrayList<>(t);
        Collections.sort(t2);
        System.out.println("t2: ");
        for(Cala x : t){
            System.out.println(x.getPrice());
        }
        Cala sub = t2.get(1);
        t.remove(sub);
    }

    @Override
    public void f3(List<Cala> t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
