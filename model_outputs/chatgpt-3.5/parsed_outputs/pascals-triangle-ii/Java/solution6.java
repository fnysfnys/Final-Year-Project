import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        LinkedList<Integer> row = new LinkedList<>();
        for (int i = 0; i <= rowIndex; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
        }
        return row;
    }
}
