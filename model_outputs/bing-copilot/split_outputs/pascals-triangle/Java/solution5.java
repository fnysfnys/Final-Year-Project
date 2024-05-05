import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(combination(i, j));
            }
            result.add(row);
        }
        return result;
    }

    private int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    private int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
