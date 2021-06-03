// Java program to check whether an entered character is an integer or not

package com.company;
import java.util.Scanner;

public class CWH_07_IntegerOrNot {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        System.out.println(scan.hasNextInt());                            // scan.hasNextInt() scans a charater and displays true if integers else false
                                                                           /* boolean bool = scan.hasNextInt();
                                                                             System.out.println(bool);
                                                                             *this can also be done* */
    }
}
