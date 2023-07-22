/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;


/**
 *
 * @author USER
 */
public class EmpList {
    ArrayList<Emp> ListEmps = new ArrayList<>();
    
    public EmpList(){
        
    }

    public ArrayList<Emp> getListEmps() {
        return ListEmps;
    }

    public void setListEmps(ArrayList<Emp> ListEmps) {
        this.ListEmps = ListEmps;
    }
    
    public void addEmp(Emp emp){
        for(Emp x : ListEmps){
            if(emp.code.equals(x.code)){
                System.out.format("Duplicate employee code: %s\n", emp.code);
                return;
            }
        }
        ListEmps.add(emp);
    }
    
    public void deleteEmp(String eid){
        
        if(ListEmps.isEmpty()){
            System.out.println("List employee is empty");
            return;
        }
        
        for(Emp x : ListEmps){
            if(x.code.equals(eid)){
                ListEmps.remove(x);
                System.out.format("Employee %s is deleted\n", eid);
                return;
            }
        }
        System.out.format("Employee %s is not exist\n", eid);
    }
    
    public void display(){
        for(Emp x : ListEmps){
            System.out.println(x);
        }
    }
    
    public void summarize(){
        
        if(ListEmps.isEmpty()){
            System.out.println("List employee is empty");
            return;
        }
        
        double averageSalary = 0.00;
        for(Emp x : ListEmps){
            averageSalary += x.salary;
        }
        System.out.format("Average of salary is: %.2f\n", averageSalary/ListEmps.size());
    }
    
    public Emp searchById(String emp_id){
        
        if(ListEmps.isEmpty()){
            System.out.println("List employee is empty");
            
        }else{
            for(Emp x : ListEmps){
                if(x.getCode().equals(emp_id)){
                    return x;
                }
            }
        }
        return null;
    }
    
}
