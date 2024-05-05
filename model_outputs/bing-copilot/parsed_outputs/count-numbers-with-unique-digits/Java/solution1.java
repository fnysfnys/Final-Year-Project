import java.util.HashSet;

public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        HashSet<Integer> uniqueDigits = new HashSet<>();
        for (int i = 0; i < Math.min(n, 10); i++) {
            uniqueDigits.add(i);
        }
        int count = 1;
        for (int i = 1; i < n; i++) {
            count *= 10 - i;
        }
        return count + uniqueDigits.size();
    }
}
