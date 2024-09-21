package String.String_Buffer;

public class Main {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        // adding the string
        sb.append("Java");
        sb.append("String");
        sb.append("world");

        sb.insert(4," ");

        // replace the specified beginIndex and endIndex-1
        sb.replace(0,4,"java");

//        // reverse the string
//        sb.reverse();

        //deletes the string from the specified beginIndex to endIndex-1.
        sb.delete(11,16);

        System.out.println(sb.length());

        System.out.println(sb);

    }
}
