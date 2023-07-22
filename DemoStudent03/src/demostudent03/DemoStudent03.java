/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostudent03;

import DTO.Student;
import DTO.StudentManager;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class DemoStudent03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentManager sm = new StudentManager();
        
        Scanner sc = new Scanner(System.in);
        int myChoice;
        
        do{
            System.out.println("\n=====Student Management=====");
            System.out.println("1. Them sinh vien moi");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Xem thong tin sinh vien");
            System.out.println("4. Cap nhap thong tin sinh vien");
            System.out.println("5. Xoa sinh vien");
            System.out.println("6. Sap xep tang dan theo ma so");
            System.out.println("7. Sap xep tang dan theo ten");
            System.out.println("8. Sap xep tang dan theo tuoi");
            System.out.println("9. Sap xep tang dan theo diem");
            System.out.println("So khac: EXIT");
            System.out.println("Hay nhap lua chon");
            
            myChoice = Integer.parseInt(sc.nextLine());
            switch(myChoice){
                case 1:
                    sm.create();
                    break;
                case 2:
                    sm.read();
                    break;
                case 3:
                    sm.details();
                    break;
                case 4:
                    sm.update();
                    break;
                case 5:
                    sm.delete();//mssv
                    break;
                case 6:
                    sm.sortId();
                    break;
                case 7:
                    sm.sortName();
                    break;
                case 8:
                    sm.sortAge();
                    break;
                case 9:
                    sm.sortScore();
                    break;
                default:
                    System.out.println("EXIT");
                    break;
            }
        }while(myChoice < 10 && myChoice >=1);
    }
    
}
