public class CWH_14_StringMethods {
    public static void main(String[] args) {
        String name = "Nischal";
        // same as String name1 = new String(original: "Nischal");
        System.out.println(name);
        System.out.println(name.equals("Nischal"));             // checks equality of two strings
        System.out.println(name.equalsIgnoreCase("nIscHal"));       // ignores case of characters
        int len = name.length();                                // returns the length of the given string
        System.out.println(len);
        String lstring = name.toLowerCase();                    // returns a new string in lower case
        System.out.println(lstring);
        System.out.println(name.toUpperCase());                 // returns a new string in upper case
        String nonTrimmedString = "     Nischal     ";
        System.out.println(nonTrimmedString.trim());            // returns a new string without leading and trailing spaces
        System.out.println(name.substring(2));                  // prints substring from the given index
        System.out.println(name.substring(1,6));                // prints substring, where char in end index is ignored
        System.out.println(name.replace('a','e'));  // returns a new string where specified character is replaced by a new one
        System.out.println(name.replace("N","Mi")); // even a character should be given in double quotes
        System.out.println(name.replace("ch","hk"));
        System.out.println(name.startsWith("Nis"));                 // checks whether the string starts with the given sequence
        System.out.println(name.startsWith("n"));               // it is case sensitive
        System.out.println(name.endsWith("hal"));
        System.out.println(name.endsWith("haL"));
        System.out.println(name.charAt(2));                 // returns the character at the given index
        String newString = "Nischschchal";
        System.out.println(newString.indexOf("ch"));        // returns the index of the sequence at the first occurence
        System.out.println(newString.indexOf("chc"));
        System.out.println(newString.indexOf("ch",4));          // starts checking from the given index
        System.out.println(newString.lastIndexOf("ch"));        // returns the index of the sequence at the last occurence
        System.out.println(newString.lastIndexOf("ch",7));
        System.out.println("This is an example of escape sequence\nNew Line\tTab Space\n\"\"Double Quotes\n''Single Quotes(these need not be escaped)\n\\Backslash");
          // single quotes need not be escaped
    }
}
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  output:
  Nischal
true
true
7
nischal
NISCHAL
Nischal
schal
ischa
Nischel
Miischal
Nishkal
true
false
true
false
s
3
6
6
8
6
This is an example of escape sequence
New Line	Tab Space
""Double Quotes
''Single Quotes(these need not be escaped)
\Backslash
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
