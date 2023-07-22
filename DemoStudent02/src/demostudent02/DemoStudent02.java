/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostudent02;

import DTO.Student;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author USER
 */
public class DemoStudent02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Student> listStudents = new ArrayList<>();
        
        Student s1 = new Student("SE004", "An", 19, 7.5);
        listStudents.add(s1);
        
        listStudents.add(new Student("SE005", "Binh", 20, 7.0));
        listStudents.add(new Student("SE003", "Cuong", 18, 8.0));
        listStudents.add(new Student("SE002", "Duy", 19, 7.0));
        listStudents.add(new Student("SE001", "Em", 21, 9.0));

        System.out.println("Danh sach sinh vien");
        for(Student x : listStudents){
            System.out.println(x);
        }
        System.out.println("\n");
        
        Collections.sort(listStudents);
        System.out.println("Danh sach sinh vien xep theo tuoi");
        for(Student x : listStudents){
            System.out.println(x);
        }
        System.out.println("\n");
        
        Collections.sort(listStudents, Student.compScore);
        System.out.println("Danh sach sinh vien xep theo diem");
        for(int i = 0; i < listStudents.size(); i++){
            System.out.println(listStudents.get(i));
        }
        System.out.println("\n");
        
        Collections.sort(listStudents, Student.compId);
        System.out.println("Danh sach sinh vien xep theo ID");
        for(int i = 0; i < listStudents.size(); i++){
            System.out.println(listStudents.get(i));
        }
        System.out.println("\n");
        
    }
    
}
