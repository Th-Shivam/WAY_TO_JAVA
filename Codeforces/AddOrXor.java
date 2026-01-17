import java.io.*;
import java.util.*;

public class AddOrXor {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            if (a > b) {
                out.append(-1).append('\n');
                continue;
            }

            long d = b - a;
            long ans;

            if (x <= y) {
                ans = d * x;
            } else {
                if (d == 0) ans = 0;
                else ans = (d - 1) * x + y;
            }

            out.append(ans).append('\n');
        }
        System.out.print(out);
    }
}
