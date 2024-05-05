public int[] twoSum(int[] nums, int target) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        int j = Arrays.binarySearch(nums, i + 1, nums.length, complement);
        if (j > 0) {
            return new int[] { i, j };
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}
