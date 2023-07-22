/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.pkg2.object;

/**
 *
 * @author BakaUni
 */
public class student {
    private String fullName;
    private String studentCode;
    private Integer age;
    
    private Double mathScore;
    private Double literatureScore;
    private Double scienceScore;

    public student(){
        
    }
    
    public student(String fullName, String studentCode, Integer age, Double mathScore, Double literatureScore, Double scienceScore) {
        this.fullName = fullName;
        this.studentCode = studentCode;
        this.age = age;
        this.mathScore = mathScore;
        this.literatureScore = literatureScore;
        this.scienceScore = scienceScore;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMathScore(Double mathScore) {
        this.mathScore = mathScore;
    }

    public void setLiteratureScore(Double literatureScore) {
        this.literatureScore = literatureScore;
    }

    public void setScienceScore(Double scienceScore) {
        this.scienceScore = scienceScore;
    }
 
    public String getFullName() {
        return fullName;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public Integer getAge() {
        return age;
    }

    public Double getMathScore() {
        return mathScore;
    }

    public Double getLiteratureScore() {
        return literatureScore;
    }

    public Double getScienceScore() {
        return scienceScore;
    }
    
    public Double averageScore(){
        double result;
        result = (mathScore + literatureScore + scienceScore) /3;
        return result;
    }
   
    public String result(){ 
        if (averageScore() < 5){
            return "fail";
        }else{
            return "passed";
        }
    }
}
