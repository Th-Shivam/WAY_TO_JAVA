
public class NumberPrint {
    public static void printNum(int n){
        if(n==0){
            return ;
        }

        System.out.println(n);
        printNum(n-1);
    }    

    public static void main(String[] args) {
        int n = 5; 
        System.out.println("Printing numbers from " + n + " to 1:");
        printNum(n);
    }
}
