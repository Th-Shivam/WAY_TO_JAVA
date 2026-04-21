class Pattern_5 {
    public static void main(String[] args) {
        int n = 5;

        
        int spaces = n / 2; 

        for (int i = 1; i <= n; i += 2) { // 1, 3, 5
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces--;
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        spaces = 1; 
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces++;
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
