import java.util.* ;
public class Substring {
    public static void main(String args[]){

        // Using StringBuilder to create a string
        StringBuilder sb = new StringBuilder("Hello");

        // Demonstration of some common StringBuilder methods

        System.out.println("\nCharacter at index 0: " + sb.charAt(0));

        sb.setCharAt(2, 'm');

        System.out.println("After setting character at index 2 to 'm': " + sb);

        sb.insert(4, 'o');

        System.out.println("After inserting 'o' at index 4: " + sb);

        sb.delete(5,6);

        System.out.println("After deleting characters from index 5 to 6: " + sb);

        System.out.println("Printing a substring of the string sb " + sb.substring(0,3));

        sb.append(" World");

        System.out.println("After appending ' World': " + sb);

        sb.setCharAt(2 , 'l');

        System.out.println("After setting the char 'm'  to 'l' again : " + sb );





    }
}
