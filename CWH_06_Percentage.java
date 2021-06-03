// Java program to calculate percentage by reading 6 inputs from the user

package com.company;
import java.util.Scanner;

public class CWH_06_Percentage {
    public static void main(String[] args){
        System.out.println("Percentage calculator");
        System.out.println("Enter the marks of 6 subjects");
        Scanner scan = new Scanner(System.in);                                    // creating new scanner class so that we can accept inputs
        byte sub1 = scan.nextByte(), sub2 = scan.nextByte(), sub3 = scan.nextByte(), sub4 = scan.nextByte(),
       sub5 = scan.nextByte(), sub6 = scan.nextByte();
        int total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
        System.out.println("The total marks obtained are " + total);
        float percentage = (total/6f);                                            // typecasting to float
        System.out.println("The percentage obtained is " + percentage);
    }
}
