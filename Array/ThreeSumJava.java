import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSumJava {
    public List<List<Integer>> threeSum(int[] a) {
        Arrays.sort(a);
        List<List<Integer>> r = new ArrayList<>();
        int n = a.length;

        for (int i = 0; i < n - 2; i++) {
            if (a[i] > 0) break;
            if (i > 0 && a[i] == a[i - 1]) continue;

            int l = i + 1;
            int h = n - 1;

            while (l < h) {
                int s = a[i] + a[l] + a[h];

                if (s == 0) {
                    r.add(Arrays.asList(a[i], a[l], a[h]));
                    while (l < h && a[l] == a[l + 1]) l++;
                    while (l < h && a[h] == a[h - 1]) h--;
                    l++;
                    h--;
                } else if (s < 0) {
                    l++;
                } else {
                    h--;
                }
            }
        }
        return r;
    }
}