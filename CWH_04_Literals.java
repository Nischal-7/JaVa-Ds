// Java program to depict some of the literals
package com.company;

public class JCWH_04_Literals {
    public static void main(String[] args) {
        byte age = 34;                            // usually age will not be more than 127
        char ch = 'A';
        float f1 = 4.7f;
        double d1 = 5.6;                          //by default the compiler considers this as 5.6d or 5.6D
        long l1 = 4234233423787434L;              // L is followed by a long integer
        String str = "Nischal";
                                                  // these are literals
        System.out.println(age);
        System.out.println(ch);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(l1);
        System.out.println(str);
    }
}
