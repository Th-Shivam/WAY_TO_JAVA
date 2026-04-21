import java.util.List;
import java.util.ArrayList;

class Pascals_2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> lst = new ArrayList<>();
        int first = 1;
        lst.add(first);
        long res = 1;
        for(int col=1; col<=rowIndex; col++){
            res = res * (rowIndex - col + 1);
            res = res / col;
            lst.add((int)res);
        }
        return lst;
    }
}