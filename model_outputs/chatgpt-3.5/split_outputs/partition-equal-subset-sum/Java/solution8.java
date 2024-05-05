public boolean canPartition(int[] nums) {
    int sum = 0;
    for (int num : nums) {
        sum += num;
    }
    if (sum % 2 != 0) {
        return false; // If the total sum is odd, partition is not possible.
    }
    int target = sum / 2;
    Map<Integer, Boolean> dp = new HashMap<>();
    dp.put(0, true);
    
    for (int num : nums) {
        Map<Integer, Boolean> newDp = new HashMap<>(dp);
        for (int subsetSum : dp.keySet()) {
            newDp.put(subsetSum + num, true);
        }
        dp = newDp;
    }
    return dp.containsKey(target);
}
