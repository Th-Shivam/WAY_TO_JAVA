import java.util.* ;
public class pythagorastri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println("The numbers form a Pythagorean triplet.");
        } else {
            System.out.println("The numbers do not form a Pythagorean triplet.");   
    }
    sc.close();
}

}
