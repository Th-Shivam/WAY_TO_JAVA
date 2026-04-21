import java.io.*;
import java.net.*;

public class URLExample {
    public static void main(String[] args) {
        try {
            // Create URL object
            URL url = new URL("https://smrion.app/index.html");

            // Open connection
            URLConnection con = url.openConnection();

            // Read data using BufferedReader
            BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream())
            );

            String line;

            // Read and print webpage content
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}