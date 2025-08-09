class PrintSubseq {
    
    public static void subseq(String str , int idx  , String newStr){
        if(idx == str.length()){
            System.out.println(newStr) ;
            return ;
        }
        char currChar = str.charAt(idx) ;
        subseq(str , idx+1 , newStr+currChar) ;
        subseq(str , idx+1 , newStr) ;
        
    }
    public static void main(String[] args) {
        subseq("abc" , 0 , "") ;
    }
}