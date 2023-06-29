public class StringMethods {
    public static void main(String[] args) {
        // String initialization
        // using constructor
        String s1 = new String("JavaStrings");
        // using string literal
        String s2 = "JavaStrings";
        // creating string from byte array
        byte[] arr = {97, 98, 99, 100, 101};
        String s3 = new String(arr);
        // creating string from byte array with specified offset and length
        String s4 = new String(arr, 1, 3);
        // creating string from char array
        char[] brr = {'P', 'R', 'A', 'N', 'A', 'V'};
        String s5 = new String(brr);
        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + "s4" + "\n" + s5);

        // String methods
        // get the length of the string
        System.out.println(s2.length());
        // get the character at the specified index
        System.out.println(s2.charAt(1));
        // get the substring starting from the specified index
        System.out.println(s2.substring(1));
        // get the substring from the specified start index (inclusive) to end index (exclusive)
        System.out.println(s2.substring(2, 5));
        // get the index of the specified substring
        String x = "Learn Share Learn";
        System.out.println(x.indexOf("Share"));
        // get the index of the specified substring starting from the specified index
        System.out.println(x.indexOf("Learn", 6));
        // get the last index of the specified substring
        System.out.println(x.lastIndexOf("Learn"));
        // concatenate two strings
        String a = "abc", b = "def", c = a.concat(b);
        System.out.println(c);
        // convert the string to uppercase
        s2 = s2.toUpperCase();
        System.out.println(s2);
        // convert the string to lowercase
        s2 = s2.toLowerCase();
        System.out.println(s2);

        // Java strings are immutable demonstration
        System.out.println(s5);
        // PRANAV
        s5.concat(" CHATURVEDI");
        // concatenate a string (immutable)
        System.out.println(s5);
        // PRANAV
        s5 = s5.concat(" CHATURVEDI");
        // reassign the concatenated string to s5
        System.out.println(s5);
        // PRANAV CHATURVEDI

        // StringBuffer class
        // Almost all String methods also work on StringBuffer

        StringBuffer sb = new StringBuffer("Assign");
        // append a string
        sb.append("ment");
        System.out.println(sb);
        // insert a string at the specified index
        sb.insert(0, "1_");
        System.out.println(sb);
        // replace a portion of the string with another string
        sb.replace(0, 2, "2_");
        System.out.println(sb);
        // reverse the string
        sb.reverse();
        System.out.println(sb);
        // delete the character at the specified index
        sb.reverse();
        sb.deleteCharAt(1);
        System.out.println(sb);

        // StringBuilder class
        StringBuilder sbuilder = new StringBuilder("Pranav ");
        // Any data type can be appended
        sbuilder.append(1.3);
        System.out.println(sbuilder);
        // get the Unicode value at the specified index
        System.out.println(sbuilder.codePointAt(0));

        // get the Unicode value before the specified index
        System.out.println(sbuilder.codePointBefore(1));

        // set the character at the specified index
        sbuilder.setCharAt(0, 'R');

        System.out.println(sbuilder);
    }
}
