import java.util.* ;
public class conditionals {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("The first number is greater than the second number.");
        } else if(num1 < num2) {
            System.out.println("The first number is less than the second number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();

    }
}
