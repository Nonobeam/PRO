/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg2;

import java.util.Scanner;
import lab03.pkg2.object.student;

/**
 *
 * @author BakaUni
 */
public class Programe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student Student = new student();
        
        Scanner sc = new Scanner(System.in);
        
        Student.setStudentCode(sc.nextLine());
        Student.setFullName(sc.nextLine());
        Student.setAge(Integer.parseInt(sc.nextLine()));
        Student.setMathScore(Double.parseDouble(sc.nextLine()));
        Student.setLiteratureScore(Double.parseDouble(sc.nextLine()));
        Student.setScienceScore(Double.parseDouble(sc.nextLine()));
        
        System.out.format("MSSV: %s, TEN: %s, TUOI: %d, DIEM TRUNG BINH: %.2f, KET QUA: %s \n", Student.getStudentCode(),Student.getFullName(),Student.getAge(), Student.averageScore(), Student.result());
    }
    
}
