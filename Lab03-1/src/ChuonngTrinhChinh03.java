
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class ChuonngTrinhChinh03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        
        double rong;
        double dai;
        
        rong = Double.parseDouble(sc.nextLine());
        dai = Double.parseDouble(sc.nextLine());
        
        rec.setWidth(rong);
        rec.setLength(dai);
        
        System.out.format("Chieu rong: %.2f chieu dai: %.2f\n\nChu vi: %.2f dien tich: %.2f", rec.getWidth(), rec.getLength(), rec.perimenter(), rec.area());
    }
}
