import java.util.ArrayList;
import java.util.HashMap

;
import java.util.List;
import java.util.Map;

class Solution {
    private Map<Integer, List<Integer>> cache = new HashMap<>();

    public List<Integer> getRow(int rowIndex) {
        if (cache.containsKey(rowIndex)) {
            return cache.get(rowIndex);
        }

        List<Integer> row = new ArrayList<>();
        if (rowIndex == 0) {
            row.add(1);
        } else {
            List<Integer> prevRow = getRow(rowIndex - 1);
            row.add(1);
            for (int i = 1; i < rowIndex; i++) {
                row.add(prevRow.get(i - 1) + prevRow.get(i));
            }
            row.add(1);
        }

        cache.put(rowIndex, row);
        return row;
    }
}
