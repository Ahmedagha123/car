
package oop.java;

import java.util.Scanner;

public class OopJava {

    public static void main(String[] args) {
      
       Scanner scan=new Scanner(System.in) ;
       Car BMW=new Car ();
        
        System.out.println("Enter Distance BMW");
        BMW.setdistance(scan.nextFloat());
        System.out.println("Enter Speed BMW");
        BMW.setspeed(scan.nextFloat());
       System.out.println(BMW.gettime()) ;
        System.out.println("**************************************************************************************************************");
       Car Cooper=new Car ();
       System.out.println("Enter Distance Cooper");
       Cooper.setdistance ( scan.nextFloat()); 
       System.out.println("Enter Speed Cooper");
       Cooper.setspeed (scan.nextFloat());
       System.out.println(Cooper.gettime()) ;
        
        
    }
}
