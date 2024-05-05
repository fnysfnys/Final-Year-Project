public int[] twoSum(int[] nums, int target) {
    List<Integer> list = new LinkedList<>();
    for (int num : nums) {
        list.add(num);
    }
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        list.remove(Integer.valueOf(nums[i]));
        if (list.contains(complement)) {
            return new int[] { i, list.indexOf(complement) + 1 };
        }
        list.add(i, nums[i]);
    }
    throw new IllegalArgumentException("No two sum solution");
}
