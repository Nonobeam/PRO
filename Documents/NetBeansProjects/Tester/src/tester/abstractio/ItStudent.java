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
public class ItStudent implements ICoder, IGamer, IHacker {
    @Override
    public void code() {
    }

    @Override
    public void playGame() {
    }

    @Override
    public void hackFacebook() {
    }

    @Override
    public Integer sleep(Integer time) {
        return time;
    }
}
