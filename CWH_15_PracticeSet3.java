public class CWH_15_PracticeSet {
    public static void main(String[] args) {
       // Problem 1
        String name = "NiscHal";
        name = name.toLowerCase(Locale.ROOT);
        System.out.println(name);

        // Problem 2
        String text = "This is a Java Program";
        System.out.println(text);
        text = text.replace(" ","_");
        System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, thanks a lot!";
        System.out.println(letter);
        letter = letter.replace("<|name|>","Nischal");
        System.out.println(letter);

        // Problem 4
        String sentence = "I am currently  learning java   , it is fun!";
        System.out.println(sentence.indexOf("  "));
        System.out.println(sentence.indexOf("   "));

        // Problem 5
        String letter1 = "Dear Harry, This Java Course is made easy to understand. Thanks!";
        System.out.println(letter1);
        String letter2 = "Dear Harry,\n\tThis Java Course is made easy to understand.\n\tThanks!";
        System.out.println(letter2);
    }
}
/*------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Output:

nischal
This is a Java Program
This_is_a_Java_Program
Dear <|name|>, thanks a lot!
Dear Nischal, thanks a lot!
14
29
Dear Harry, This Java Course is made easy to understand. Thanks!
Dear Harry,
	This Java Course is made easy to understand.
	Thanks!

------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
