import java.util.Scanner;
import java.io.*;

class KeyboardInput {
    public static void main(String[] args) throws Exception {

        // 1. Using Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name using Scanner: ");
        String name1 = sc.nextLine();
        System.out.println("You entered: " + name1);

        System.out.println("--------------------------------");

        // 2. Using Console Class
        if (System.console() != null) {
            String name2 = System.console().readLine("Enter name using Console: ");
            System.out.println("You entered: " + name2);
        } else {
            System.out.println("Console not available (run in terminal)");
        }

        System.out.println("--------------------------------");

        // 3. Using InputStreamReader and BufferedReader
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        System.out.print("Enter name using BufferedReader: ");
        String name3 = br.readLine();
        System.out.println("You entered: " + name3);
    }
}
