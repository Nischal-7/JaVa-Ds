// Java program to show precedence and associativity

package com.company;

public class CWH_09_Precedence_Associativity{
public static void main(String[]args){
        int a = 6*5-34/2;
        /*
        Highest precedence is given for * and / since both are included in the expression,
        according to associativity left to right is evaluated
                = 30 - 34/2
                = 30 - 17
                = 13
         */
        System.out.println(a);
        int b = 60/5-32*2;
        /*
                = 12 - 32*2
                = 12 - 64
                = -52
         */
        System.out.println(b);
        }
}
