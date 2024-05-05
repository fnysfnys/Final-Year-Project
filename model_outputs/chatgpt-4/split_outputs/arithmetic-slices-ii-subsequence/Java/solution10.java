import java.util.stream.IntStream;

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        return IntStream.range(0, nums.length - 2)
                .map(i -> IntStream.range(i + 1, nums.length - 1)
                    .map(j -> IntStream.range(j + 1, nums.length)
                        .map(k -> nums[k] - nums[j] == nums[j] - nums[i] ? 1 : 0)
                        .sum())
                    .sum())
                .sum();
    }
}
