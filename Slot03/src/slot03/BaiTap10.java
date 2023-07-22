/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot03;

/**
 *
 * @author BakaUni
 */
public class BaiTap10 {
    public static void main(String[] args) {
        try {
            double kq = 10 / 0;
            System.out.format("Ket qua la: %f", kq);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
