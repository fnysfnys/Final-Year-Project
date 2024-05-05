public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        int finalI = i;
        int complement = target - nums[i];
        int index = IntStream.range(0, nums.length)
                .filter(j -> j != finalI && nums[j] == complement)
                .findFirst()
                .orElse(-1);
        if (index != -1) {
            return new int[] {i, index};
        }
    }
    return null; // No valid solution found.
}
