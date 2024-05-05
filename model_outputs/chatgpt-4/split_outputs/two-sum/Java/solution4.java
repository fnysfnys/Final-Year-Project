public int[] twoSum(int[] nums, int target) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
        int complement = target - num;
        if (set.contains(complement)) {
            return new int[] { num, complement };
        }
        set.add(num);
    }
    throw new IllegalArgumentException("No two sum solution");
}
