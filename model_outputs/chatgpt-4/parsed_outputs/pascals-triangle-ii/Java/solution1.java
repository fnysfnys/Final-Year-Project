import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);
        long number = 1;
        for (int i = 0; i <= rowIndex; i++) {
            row.add((int)number);
            number = number * (rowIndex - i) / (i + 1);
        }
        return row;
    }
}