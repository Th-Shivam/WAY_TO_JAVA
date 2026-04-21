import java.util.* ;
public class conditionals {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the first number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter the second number: ");
        // int num2 = sc.nextInt();

        // if(num1>num2){
        //     System.out.println("The first number is greater than the second number.");
        // } else if(num1 < num2) {
        //     System.out.println("The first number is less than the second number.");
        // } else {
        //     System.out.println("Both numbers are equal.");
        // }
        System.out.println("Press 1 for English, 2 for Hindi, 3 for French");
        int button = sc.nextInt();
        switch(button) {
            case 1: 
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("Namaste");
            break;
            case 3:
            System.out.println("Bonjour");  
            default:
            System.out.println("please select a valid option");    
        }

        sc.close();

    }
}
