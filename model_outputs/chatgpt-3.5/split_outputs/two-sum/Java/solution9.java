public int[] twoSum(int[] nums, int target) {
    TreeMap<Integer, Integer> numToIndex = new TreeMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        Integer index = numToIndex.get(complement);
        if (index != null) {
            return new int[] {index, i};
        }
        numToIndex.put(nums[i], i);
    }
    return null; // No valid solution found.
}
