/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester.abstractio;

/**
 *
 * @author BakaUni
 */
public class abstraction {
    public static void main(String[] args) {
        IGamer gamer = new ItStudent();
        System.out.println(gamer.time);

        ICoder coder = new ItStudent();
        System.out.println(coder.time);

        IHacker hacker = new ItStudent();
        System.out.println(hacker.time);
        
        
    }
}
