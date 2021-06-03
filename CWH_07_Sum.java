// Java program to calculate sum of three numbers taking input from the user

package com.company;
import java.util.Scanner;

public class CWH_07_Sum {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter any 3 numbers to find sum");                              // writing this comment for the sake of writing
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt(), total;
        total = num1 + num2 +num3;
        System.out.println("The sum of the 3 numbers is "+ total);
    }
}
