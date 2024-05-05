public int combinationSum4(int[] nums, int target) {
    Set<Integer> dp = new HashSet<>();
    dp.add(0);
    
    for (int i = 1; i <= target; i++) {
        for (int num : nums) {
            if (i - num >= 0 && dp.contains(i - num)) {
                dp.add(i);
            }
        }
    }
    
    return dp.contains(target) ? 1 : 0;
}
