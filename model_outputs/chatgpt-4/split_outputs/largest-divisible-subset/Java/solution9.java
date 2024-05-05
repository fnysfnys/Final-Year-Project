import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        TreeSet<Integer> sortedNums = new TreeSet<>();
        for (int num : nums) {
            sortedNums.add(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int num : sortedNums) {
            List<Integer> temp = new ArrayList<>();
            temp.add(num);
            for (int res : result) {
                if (num % res == 0) {
                    temp.add(res);
                }
            }
            if (temp.size() > result.size()) {
                result = temp;
            }
        }

        Collections.sort(result);
        return result;
    }
}
