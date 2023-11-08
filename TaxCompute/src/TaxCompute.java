
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PC
 */
class BroSis {

    private double salary;
}

class Children {

    private int age;
    private boolean school;

    public Children(int age, boolean school) {
        this.age = age;
        this.school = school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSchool() {
        return school;
    }

    public void setSchool(boolean school) {
        this.school = school;
    }
    
}

class Parent {
    private int age;
    private boolean sex;
}

public class TaxCompute {

    Library library = new Library();

    public Children inputChildren() {
        int age = Integer.parseInt(library.getValue("Age of children: "));
        System.out.print("School or not: ");
        boolean school = library.checkInputYN();
        return new Children(age, school);
    }
    
    

    public static void main(String[] args) {
        TaxCompute taxCompute = new TaxCompute();

        Person person = new Person("Daniel", 2, 2, 1, 20000000);
        int numberChildren = person.getNumberChildren();
        Children[] childrens = new Children[numberChildren];
        int i = 0;
        while (numberChildren-- > 0) {
            childrens[i++] = taxCompute.inputChildren();
        }
        
        int numberParent = person.getNumberParent();
        
        while (numberChildren-- > 0){
            
        }
        
        
        System.out.println("End");
    }

}
