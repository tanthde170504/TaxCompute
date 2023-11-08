/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Person {
     private String name;
    private int numberChildren;
    
    private int numberParent;
    private int numberBrosis;
    private double salary;
    
    public Person(String name, int numberChildren, int numberParent, int numberBrosis, double salary) {
        this.name = name;
        this.numberChildren = numberChildren;
        this.numberParent = numberParent;
        this.numberBrosis = numberBrosis;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberChildren() {
        return numberChildren;
    }

    public void setNumberChildren(int numberChildren) {
        this.numberChildren = numberChildren;
    }

    public int getNumberParent() {
        return numberParent;
    }

    public void setNumberParent(int numberParent) {
        this.numberParent = numberParent;
    }

    public int getNumberBrosis() {
        return numberBrosis;
    }

    public void setNumberBrosis(int numberBrosis) {
        this.numberBrosis = numberBrosis;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
