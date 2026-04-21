public class exceptionHandling {
    public static void main(String[] args) {
        try{
            int a = 10 ;
            int b = 0 ;
            int div = a/b ;
            System.out.println(div);

        }catch(ArithmeticException e ){
            System.out.println("Division by 0 is not possible .");
        } finally {
            System.out.println("This block is always executed .");
        }
    }
}
