/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Comparator;

/**
 *
 * @author USER
 */
public class Student implements Comparable{
    private String id;
    private String name;
    private int age;
    private double score;
    
    public Student(){
        
    }

    public Student(String id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    public static Comparator compScore = new Comparator(){  
        @Override
        public int compare(Object stuS1, Object stuS2){
            Student stu1 = (Student)stuS1;
            Student stu2 = (Student)stuS2;
            if(stu1.getScore() > stu2.getScore()){
                return 1;
            }else if(stu1.getScore() == stu2.getScore()){
                return 0;
            }else{
                return -1;
            }
        }
    };
    
    public static Comparator compId = new Comparator(){  
        @Override
        public int compare(Object stuS1, Object stuS2){
            Student stu1 = (Student)stuS1;
            Student stu2 = (Student)stuS2;
            return stu1.getId().compareTo(stu2.getId());
        }
    };

    public static Comparator compName = new Comparator(){  
        @Override
        public int compare(Object stuS1, Object stuS2){
            int stu1 = ((Student)stuS1).getName().length();
            int stu2 = ((Student)stuS2).getName().length();
            if(stu1 > stu2){
                return 1;
            }else if(stu1 == stu2){
                return 0;
            }else{
                return -1;
            }
        }
    };
    
    @Override
    public int compareTo(Object stu1){
        Student stu = (Student)stu1;
        if (this.getAge() > stu.getAge()){
            return 1;
        }
        else if(this.getAge() == stu.getAge()){
            return 0;
        }
        else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", score=" + score + '}';
    }
    
}
