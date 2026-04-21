public class twoSum {
    public static int[] sum(int[] numbers , int target){
        // returns the index , 1-indexed array
        int i = 0 ;
        int j = numbers.length-1 ;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1 , j+1} ;
            } else if(numbers[i]+numbers[j]<target){
                i++ ;
            }else{
                j-- ;
            }
        }
        return new int[]{} ;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,5,7,8} ;
        int target = 7 ;
        int[] result = sum(numbers , target) ;
        System.out.println("Result: [" + result[0] + ", " + result[1] + "]");
    }
}
