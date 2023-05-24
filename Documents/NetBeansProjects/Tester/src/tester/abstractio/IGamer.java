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
public interface IGamer {
    Integer time = 0;
    Integer sleep(Integer time);
    void playGame();
}
