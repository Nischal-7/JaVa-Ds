// Java program to calculate GPA

package com.company;
import java.util.Scanner;

public class CWH_07_GPA {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks of the 6 subjects");
        byte sub1 = scan.nextByte(), sub2 = scan.nextByte(), sub3 = scan.nextByte(), sub4 = scan.nextByte(),sub5 = scan.nextByte(), sub6 = scan.nextByte();
        // all the inputs are taken from the user, these are initialized as bytes because marks won't be more than 100 for a particular subject
        int total;
        total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
        float GPA;                              // GPA is initialized as float because we may get a decimal
        GPA = total/60f;                        // typecasting
        System.out.println("The total of 6 subjects is "+ total +" & the GPA is " + GPA);
    }
}
