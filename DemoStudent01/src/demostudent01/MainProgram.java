/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostudent01;

import DTO.Student;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Student> listStudents = new ArrayList<>();
        
        Student s1 = new Student("SE001", "An", 19, 7.5);
        listStudents.add(s1);
        
        listStudents.add(new Student("SE002", "Binh", 20, 7.0));
        listStudents.add(new Student("SE003", "Cuong", 18, 8.0));
        listStudents.add(new Student("SE004", "Duy", 19, 7.0));
        listStudents.add(new Student("SE005", "Em", 21, 9.0));
        
        System.out.println(listStudents.get(2).getName());
        
        listStudents.get(2).setScore(9.5);
        
        System.out.println("Danh sach ma so, ten sinh vien");
        for(int i = 0; i < listStudents.size();i++){
            System.out.format("%s %s \n"
                    ,listStudents.get(i).getId()
                    ,listStudents.get(i).getName());
        }
        
        System.out.println("Danh sach ten, tuoi sinh vien");
        for(Student x : listStudents){
            System.out.format("%s, %d \n", x.getName(), x.getAge());
        }
        
        System.out.println("Danh sach sinh vien");
        for(Student x : listStudents){
            System.out.println(x);
        }
        
        int s = 0;
        for(Student x: listStudents){
            s+= x.getAge();
        }
        System.out.format("Tong tuoi cua cac sinh vien la: %d\n", s);
        
        int d = 0;
        for(Student x: listStudents){
            d+= x.getScore();
        }
        System.out.format("Tong diem cua cac sinh vien la: %d\n", d);
        
    }
    
}
