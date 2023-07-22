/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class StudentManager {
    private ArrayList<Student> listStudents= new ArrayList<>();
    
    
    public void create(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input id: ");
        String _id = sc.nextLine();
        System.out.println("Input name: ");
        String _name = sc.nextLine();
        System.out.println("Input age: ");
        int _age = Integer.parseInt(sc.nextLine());
        System.out.println("Input score: ");
        double _score = Double.parseDouble(sc.nextLine());
        
        Student st = new Student(_id, _name, _age, _score);
        
        listStudents.add(st);
        
    }
    
    public void read(){
        System.out.println("\nDanh sach sinh vien");
        for (Student x : listStudents){
            System.out.println(x);
        }
    }
    
    public void details(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input id: ");
        String _id = sc.nextLine();
        
        System.out.println("\nThong tin sinh vien:");
        for(Student x : listStudents){
            if (x.getId().equals(_id)){
                System.out.println(x);
                return;
            }
        }
        System.out.println("Note found ...");
    }
    
    public void update(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input Name:");
        String _name = sc.nextLine();
        
        for (Student x : listStudents){
            if(x.getName().matches("(.*)" + _name + "(.*)")){
                System.out.println(x);
                
                //name
                System.out.println("If you want to change the name, please input down here or left it and press enter: ");
                String subName = sc.nextLine();
                if (!subName.isEmpty()){
                    x.setName(subName);
                }
                
                //age
                System.out.println("If you want to change the age, please input down here or left it and press enter: ");
                String intakeAge = sc.nextLine();
                if (!intakeAge.isEmpty()){
                    x.setAge(Integer.parseInt(intakeAge));
                } 
                
                //score
                System.out.println("If you want to change the score, please input down here or left it and press enter: ");
                String intakeScore = sc.nextLine();
                if (!intakeScore.isEmpty()){
                    x.setScore(Integer.parseInt(intakeScore));
                }
                
                System.out.println(x);
                return;
            }
        }
        
    }
    
    public void delete(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input ID to delete: ");
        String _id = sc.nextLine();
        for(Student x : listStudents){
            if(x.getId().matches(_id)){
                System.out.println(x);
                
                System.out.println("Are you sure want to delete it? If you sure enter sure down here or left it: ");
                String checkSure = sc.nextLine();
                if (!checkSure.isEmpty()){
                    checkSure.toLowerCase();
                    if (checkSure.matches("sure")){
                        listStudents.remove(x);
                    }else{
                        System.out.println("Student not deleted");
                    }
                }
                return;
            }
        }
        System.out.println("Note found...");
    }
    
    public void sortId(){
        Collections.sort(listStudents, Student.compId);
        System.out.println("Danh sach sinh vien xep theo id: ");
        for (Student listStudent : listStudents) {
            System.out.println(listStudent);
        }
    }
    
    public void sortName(){
        Collections.sort(listStudents, Student.compName);
        System.out.println("Danh sach sinh vien xep theo ten");
        for (Student listStudent : listStudents) {
            System.out.println(listStudent);
        }
    }
    
    public void sortAge(){
        Collections.sort(listStudents);
        System.out.println("Danh sach sinh vien xep theo tuoi");
        for (Student listStudent : listStudents) {
            System.out.println(listStudent);
        }
    }
    
    public void sortScore(){
        Collections.sort(listStudents, Student.compScore);
        System.out.println("Danh sach sinh vien xep theo diem");
        for (Student listStudent : listStudents) {
            System.out.println(listStudent);
        }
    }
}
