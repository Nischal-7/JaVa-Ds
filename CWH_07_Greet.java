// Java program to Greet the user

package com.company;
import java.util.Scanner;

    public class CWH_07_Greet{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your name");
            String name = scan.nextLine();                                  // a string of characters can be accepted as input including spaces
            System.out.println("Hello " + name +", have a good day!");
        }
}
