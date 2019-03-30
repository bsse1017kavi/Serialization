/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializePackage;

import java.io.Serializable;

/**
 *
 * @author iit
 */
public class Student implements Serializable{

    String name;
    transient String university;
    double weight;
    
    protected static int number_Of_DU_students = 0;
    
    public Student() {
        
        this("Unknown", "Unknown", 0.0);    
    }

    public Student(String name, String university, double weight) {
        this.name = name;
        this.university = university;
        this.weight = weight;
        
        if (university.equalsIgnoreCase("DU"))
                number_Of_DU_students++;
        
    }
    
    public void printName(){
        System.out.println("Hello " + this.name);
    }
    
    public static int getNumberOfDUStudents(){
        return number_Of_DU_students;
    }
    
    
}
