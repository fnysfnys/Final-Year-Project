import java.util.stream.IntStream;

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        return IntStream.range(0, nums.length - 2)
                .map(i -> IntStream.range(i + 2, nums.length)
                        .takeWhile(j -> nums[j] - nums[j - 1] == nums[i + 1] - nums[i])
                        .map(j -> 1)
                        .sum())
                .sum();
    }
}