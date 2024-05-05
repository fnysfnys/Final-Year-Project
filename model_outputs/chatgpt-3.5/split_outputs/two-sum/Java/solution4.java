public int[] twoSum(int[] nums, int target) {
    Set<Integer> numSet = new HashSet<>();
    for (int num : nums) {
        int complement = target - num;
        if (numSet.contains(complement)) {
            return new int[] {num, complement};
        }
        numSet.add(num);
    }
    return null; // No valid solution found.
}
