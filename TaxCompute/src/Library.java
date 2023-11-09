/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Library {
    Scanner sc = new Scanner(System.in);
    
    public String getValue(String msg){
        System.out.print(msg);
        return sc.nextLine();
    }
    
    public int getIntForMenu(String msg, int min, int max){
        int a = -1;
        while(true){
            System.out.print(msg);
            try {
                a = Integer.parseInt(sc.nextLine());
                if(a >= min && a <= max){
                    break;
                }else{
                    System.out.println("Please enter a number between " + min + " and " + max);
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + min + " and " + max);
            }
        }
        return a;
    }
    
    public int getInteger(String msg){
        int a = -1;
        while (true) {            
            System.out.println(msg);
            try {
                a = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Only input number");
                continue;
            }
            break;
        }
        return a;
    }

    public int getIntegerGreatThan0(String msg){
        int a = -1;
        while (true) {
            System.out.println(msg);
            try {
                a = Integer.parseInt(sc.nextLine());
                if(a < 0){
                    System.out.println("Must be great than 0");
                    continue;

                }

            } catch (Exception e) {
                System.out.println("Only input number");

                continue;
            }
            break;
        }
        return a;
    }

    public double getDouble(String msg){
        double a = -1;
        while (true) {
            System.out.println(msg);
            try {
                a = Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Only input number");
                continue;
            }
            break;
        }
        return a;
    }

    public String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    
    public boolean checkInputYN() {
        
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            //return true if user input y/Y
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            //return false if user input n/N
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    public boolean maleOrFemale() {

        //loop until user input correct
        while (true) {
            String result = checkInputString();
            //return true if user input y/Y
            if (result.equalsIgnoreCase("m")) {
                return true;
            }
            //return false if user input n/N
            if (result.equalsIgnoreCase("f")) {
                return false;
            }
            System.err.println("Please input m/M or f/F.");
            System.out.print("Enter again: ");

        }
    }
}
