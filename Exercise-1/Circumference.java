import java.util.* ;

public class Circumference {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        double radius = sc.nextDouble();
        double circumference = 2 * 3.14 * radius;
        System.out.println("The circumference of the circle is: " + circumference);
        sc.close();
    }
}
