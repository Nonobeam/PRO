/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot07.model;

/**
 *
 * @author nguye
 */
public class Student extends Person{
    String studentId;
    String majorField;
    String degreeSought;

    public Student() {
    }

    public Student(String studentId, String majorField, String degreeSought, String name, String address, String birthDate, String idNumber) {
        super(name, address, birthDate, idNumber);
        this.studentId = studentId;
        this.majorField = majorField;
        this.degreeSought = degreeSought;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajorField() {
        return majorField;
    }

    public void setMajorField(String majorField) {
        this.majorField = majorField;
    }

    public String getDegreeSought() {
        return degreeSought;
    }

    public void setDegreeSought(String degreeSought) {
        this.degreeSought = degreeSought;
    }
    
    @Override
    public void doWork(){
        System.out.println("Lam bai tap ve nha");
    }
}
