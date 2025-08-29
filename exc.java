class exc {
    public static void main(String args[]){
       try {
        throw new ArithmeticException("error captured ");
       } catch (Exception e) {
        System.out.println("e.getMessage() = " + e.getMessage());
       } 
    }
}