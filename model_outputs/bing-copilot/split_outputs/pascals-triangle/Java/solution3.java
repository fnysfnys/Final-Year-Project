import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(pascalValue(i, j));
            }
            result.add(row);
        }
        return result;
    }

    private int pascalValue(int row, int col) {
        if (col == 0 || col == row) return 1;
        return pascalValue(row - 1, col - 1) + pascalValue(row - 1, col);
    }
}
