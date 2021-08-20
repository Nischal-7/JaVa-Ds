package com.company;

public class CWH_10_IncrementAndDecrement{
    public static void main(String[] args) {
        byte i = 6, j = 12;
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
        i = 6;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        System.out.println(j);
        System.out.println(j++);
        System.out.println(j);
        j = 12;
        System.out.println(j);
        System.out.println(++j);
        System.out.println(j);
        byte x = 6;
        System.out.println(++x * 8);        // increment operator has more precedence compared to * & /

    }
}
