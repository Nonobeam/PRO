/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */


public class Robot {
    protected String id;
    protected String name;
    protected double engine;
    protected double heal;
    

    public Robot() {
        this.id = "empty";
        this.name = "undefined-empty";
        this.engine = 0;
        this.heal = 0;
    }
    
        
    public Robot(String id, String name, double engine, double heal) {
        if (id.isEmpty()) {
            id = "empty";
        }
        
        if (name.isEmpty()) {
            name = "undefined-empty";
        }
        
        if (engine < 0) {
            engine = 0;
        }
        
        if (heal < 0) {
            heal = 0;
        }
        
        this.id = id;
        this.name = name;
        this.engine = engine;
        this.heal = heal;
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

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public double getHeal() {
        return heal;
    }

    public void setHeal(double heal) {
        this.heal = heal;
    }

    public void display(){
        String engineStatus;
        if (engine > 0){
            engineStatus = Double.toString(engine);
        }else{
            engineStatus = "Robot stops";
        }
        System.out.println("[" + this.id + "," + this.name + "," + this.heal + "," + engineStatus + "]");
    }   
    
    public String getType() {
        String myString[] = this.name.split("-");
        return myString[0];
    }

    public void upgrade() {
        this.name += "-commander";
    }
}

