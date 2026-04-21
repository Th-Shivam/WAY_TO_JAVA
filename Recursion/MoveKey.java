class MoveKey {
    public static int count = 0 ;
    public static void MoveX(String str , char key , int index , String newStr ){
        if(index == str.length()){
            for(int i = 0 ; i < count ; i++){
                newStr += "x";
            }
            System.out.println(newStr);
            return ;
        }
        
        if(str.charAt(index) == key){
            count++ ;
            MoveX(str , key , index+1 , newStr);
        }else{
            newStr += str.charAt(index);
            MoveX(str , key , index+1 , newStr);
        }
    }
    
    public static void main(String[] args) {
        MoveX("faxxxxbcsxxdg" , 'x' , 0 , "") ;
    }
}