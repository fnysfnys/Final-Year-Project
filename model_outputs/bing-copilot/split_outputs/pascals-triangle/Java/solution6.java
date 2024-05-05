import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int line = 1; line <= numRows; line++) {
            List<Integer> row = new ArrayList<>();
            int C = 1;
            for (int i = 1; i <= line; i++) {
                row.add(C);
                C = C * (line - i + 1) / i;
            }
            result.add(row);
        }
        return result;
    }
}
