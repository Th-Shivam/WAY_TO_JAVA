public class sortUnique {

    public static int[] sortUni(int[] numbers){
        int i = 0 ;
        int j = 1 ;
        while(j<numbers.length){
            if(numbers[i]==numbers[j]){
                j++ ;
            }else if(numbers[i]!= numbers[j]){
                i++ ;
                numbers[i] = numbers[j] ;
                j++ ;
            }
        }
        return numbers ;
    }

    public static void main(String[] args) {
        int[] numbers = {1,1,1,2,2,2,3,3,3,4,4,4} ;
        int[] result = sortUni(numbers) ;
        for(int num : result){
            System.out.print(num + " ") ;
        }
    }
}