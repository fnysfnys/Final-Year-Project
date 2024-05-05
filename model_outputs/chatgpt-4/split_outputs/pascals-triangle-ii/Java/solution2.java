import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return List.of(1);
        if (rowIndex == 1) return List.of(1, 1);

        List<Integer> previousRow = getRow(rowIndex - 1);
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i < rowIndex; i++) {
            row.add(previousRow.get(i - 1) + previousRow.get(i));
        }
        row.add(1);
        return row;
    }
}
