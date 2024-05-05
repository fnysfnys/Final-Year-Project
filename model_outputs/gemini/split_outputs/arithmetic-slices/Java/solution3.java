public int numberOfArithmeticSlices(int[] nums, int i, Map<Integer, Integer> memo) {
    if (i < 2) {
        return 0;
    }
    int key = i * 1000 + nums[i - 1] * 10 + nums[i]; // Combine indices and values for memoization
    if (memo.containsKey(key)) {
        return memo.get(key);
    }
    int count = 0;
    if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
        count = 1 + numberOfArithmeticSlices(nums, i - 1, memo);
    }
    memo.put(key, count);
    return count;
}

public int numberOfArithmeticSlices(int[] nums) {
    Map<Integer, Integer> memo = new HashMap<>();
    return numberOfArithmeticSlices(nums, nums.length - 1, memo);
}
