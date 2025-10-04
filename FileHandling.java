import java.io.* ;

public class FileHandling {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("abc.txt");
        String str = "Hello java baby !" ;
        fos.write(str.getBytes());
        fos.close();

        FileInputStream fis = new FileInputStream("abc.txt");
        int i ;
        while((i = fis.read()) != -1 ){
            System.out.print((char)i);
        }
        fis.close();
    }
}