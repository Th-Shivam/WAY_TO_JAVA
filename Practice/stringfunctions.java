public class stringfunctions {
    public static void main(String[] args) {
        String name = "Shivam";
        // get the charcter at the specified index
        System.out.println("First letter of the string " + name.charAt(0));
        System.out.println(name.concat(" Singh"));
        System.out.println("Strins length is : " + name.length());
        // comparing strings
        // equals() . return true if same characters and of same case .
        String name2 = "Shivam";
        System.out.println("name is same as name2 : " + name.equals(name2));
        // equalsIgnoreCase , match two strings irrespective of case
        String name3 = "shivam";
        System.out.println(name.equalsIgnoreCase(name3));
        // compareTo() . compare two strings lexicographically
        String name4 = "Shivam";
        System.out.println(name.compareTo(name4));
        // check starts with
        System.out.println("Does the name starts with S ? : " + name.startsWith("S"));
        // check ends with
        System.out.println("Does the name ends with " + name.endsWith("m"));
        // indexOf() , return the first occurnece index
        System.out.println("First occurence of S : " + name.indexOf("S"));
        // lastindexOf() , return the last index of the occurence
        System.out.println("The last occurence of S is " + name.lastIndexOf("S"));
        // extracting a part from a string
        System.out.println("from 0 to 2 index " + name.substring(0, 3));
        // replace() , replaces all the occurence of the old char and returns a new
        // string .
        System.out.println("replace " + name.replace("S", "A"));

        // trim() , removes all the leading and trailing whitespaces

        String word = "  Hello world ";
        System.out.println(word.trim());
        // uppercase and lowercase
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }
}
