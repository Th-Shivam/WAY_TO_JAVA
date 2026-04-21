import java.util.*;
class Avg {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the three numbers that you want to calculate average of.");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int avg = (a+b+c)/2;
       System.out.println("The average of the given three numbers is :" + avg );
       sc.close();
    }
}