public class TowersOfHanoi {

    public static void Move(int n , String Source , String Helper , String Destination){
        if(n==1){
            System.out.println("Move disk "+  n + " from " + Source + " to " + Destination);
            return ;
        }

        Move(n-1 , Source , Destination , Helper);
        System.out.println("Move disk "+  n + " from " + Source + " to " + Destination);
        Move(n-1 , Helper , Source , Destination);
    }
    public static void main(String args[]){
        int n = 3 ;
        Move( n , "S" , "H" , "D");
    }
}
