import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex / 2; i++) {
            long num = ((long)row.get(i - 1) * (rowIndex - i + 1)) / i;
            row.add((int)num);
        }
        for (int i = rowIndex / 2 + 1; i <= rowIndex; i++) {
            row.add(row.get(rowIndex - i));
        }
        return row;
    }
}