import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        return Arrays.stream(nums)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList())
            .stream()
            .reduce(new ArrayList<Integer>(), (subset, num) -> {
                if (subset.isEmpty() || subset.stream().allMatch(x -> x % num == 0 || num % x == 0)) {
                    subset.add(num);
                }
                return subset;
            }, (left, right) -> left.size() > right.size() ? left : right);
    }
}