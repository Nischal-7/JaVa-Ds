//Java program to explain some of the basic operators in java

package com.company;

public class CWH_08_Operators {
    public static void main(String[] args) {
        // 1. Arithmetic operators
        int a = 4, b = 6;                   // 2. = is the assignment operator
        int c = a + b;                      // +, *, %, /, %, -, ++, -- are assignment operators
        System.out.println(c);              // arithmetic operators cannot work with boolean
        System.out.println(4.7f % 1.1f);    // modulo operator can work on decimals also

        //3. These are comparison operators " ==, !=, >, <, >=, <= "
        System.out.println(a==c);
        System.out.println(a>c);
        System.out.println(7!=7);

        //4. Logical operators are &&, ||, !
        System.out.println(7>6 && 8<9);
        System.out.println(8<7 || 7>5);

        //5. Bitwise operators are &, |
        System.out.println(2&3);
        System.out.println(2|3);
        /*   10                     10                     // AND and OR operation is conducted bitwise
             11                     11
         & -------           |  ----------
             10                     11
         */
    }
}
