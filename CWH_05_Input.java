// Java program to accept input from the user
package com.company;
import java.util.Scanner;


public class CWH_05_Input {
    public static void main(String[] args){
        System.out.println("Taking input from the user!");
        Scanner scan = new Scanner(System.in);                          //scan is a variable in this case, it can be named anything else also
        System.out.println("Enter 1st number");
        int a = scan.nextInt();                                         //here scan.nextInt() is a method in Scanner class
        System.out.println("Enter 2nd number");
        int b = scan.nextInt();
        int sum = a + b;
        System.out.println("The sum of these numbers is "+sum);
        
        System.out.println("Enter a string");
        String str = scan.next();                                       //scan.next scans only till a space is encountered
                                                                        //scan.nextLine() scans whole sentence including spaces
        System.out.println(str);
        
        System.out.println("To verify if an entered number is an integer or not.");
        boolean bool = scan.hasNextInt();                               //here scan.hasNextInt() checks is a method in the scanner class if the entered number is an integer or not
        System.out.println(bool);
    }
}
