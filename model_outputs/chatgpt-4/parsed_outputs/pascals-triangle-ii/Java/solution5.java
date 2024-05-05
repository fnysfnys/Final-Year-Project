import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        return IntStream.rangeClosed(0, rowIndex)
                        .mapToObj(i -> binomial(rowIndex, i))
                        .collect(Collectors.toList());
    }

    private int binomial(int n, int k) {
        if (k > n - k) {
            k = n - k;
        }
        int res = 1;
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}