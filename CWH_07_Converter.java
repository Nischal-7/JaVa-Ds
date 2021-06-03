// Java program to convert km to other parameters

package com.company;
import java.util.Scanner;

public class CWH_07_Converter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Kilometers");
        float km = scan.nextFloat(), meter, feet, miles;              // input is taken in kilometers and other parameters are initialized
        meter = km*1000f;                                             // all these are followed by an f because floating point numbers are needed to be written in this way
        feet = km*3280.84f;
        miles = km*0.621371f;
        System.out.println(km + "km = " + meter + "m = " + feet + "ft = " + miles +"miles.");

    }
}
