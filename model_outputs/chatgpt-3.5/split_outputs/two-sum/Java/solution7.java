public int[] twoSum(int[] nums, int target) {
    List<Integer> numList = new ArrayList<>();
    for (int num : nums) {
        numList.add(num);
    }
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        int index = numList.indexOf(complement);
        if (index != -1 && index != i) {
            return new int[] {i, index};
        }
    }
    return null; // No valid solution found.
}
