package String.String_Operation;

public class Main {

    public static void main(String[] args) {

        // create a string
        String greet = "Hello! Boy...";
        System.out.println("String: " + greet);

        // get the length of greet
        int length = greet.length();
        System.out.println("Length: " + length);


        // create second
        String second = "Welcome :)";
        System.out.println("Second String: " + second);

        // join two strings
        String joinedString = greet.concat(second);
        System.out.println("Joined String: " + joinedString);

        // create 3 strings
        String first1 = "java programming";
        String second2 = "java programming";
        String third3 = "python programming";

        // compare first1 and second2 strings
        boolean result = first1.equals(second2);
        System.out.println(result);

        //compare first1 and second2 strings
        boolean result2 = first1.equals(third3);
        System.out.println(result2);

        String str1 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str1.substring(0, 4)); // java



        String text = "Java is a fun programming language";

        // split string from space
        String[] arr = text.split(" ");

        System.out.print("result = ");
        for (String str : arr) {
            System.out.print(str + ", ");
        }

        String str2 = "Java String contains()";

        // check if str1 contains "Java"
        boolean result4 = str2.contains("Java");

        System.out.println(result4); // yes


        String str3 = "Java is fun";

        // getting index of character 's'
        int result5 = str3.indexOf('s');

        System.out.println(result5); // 6

        // trim() method removes any leading (starting)
        // and trailing (ending) whitespaces from the specified string.
        String str5 = "   Learn Java Programming      ";

        System.out.println(str5.trim()); // Learn Java Programming


        String str6 = "Java Programming";

        // returns character at index 2
        System.out.println(str6.charAt(2)); // v


        str1 = "JAVA PROGRAMMING";

        // convert to lower case letters
        System.out.println(str1.toLowerCase());


         str1 = "java programming";

        // convert to lower case letters
        System.out.println(str1.toUpperCase());

        String str = "Java Programming";


        // creating a char array
        char[] arr1;

        arr1 = str.toCharArray();
        System.out.println(arr1); // Java Programming


        // toString() with Object
        Object obj1 = new Object();
        System.out.println(obj1.toString());

    }
}
