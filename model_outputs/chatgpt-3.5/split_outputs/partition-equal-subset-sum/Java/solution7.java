public boolean canPartition(int[] nums) {
    int sum = 0;
    for (int num : nums) {
        sum += num;
    }
    if (sum % 2 != 0) {
        return false; // If the total sum is odd, partition is not possible.
    }
    int target = sum / 2;
    BitSet dp = new BitSet(target + 1);
    dp.set(0);
    
    for (int num : nums) {
        BitSet newDp = (BitSet) dp.clone();
        newDp.or(dp.get(num, target + 1));
        dp = newDp;
    }
    return dp.get(target);
}
