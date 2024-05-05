class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false; // If the total sum is odd, partition is not possible.
        }
        int target = sum / 2;
        Set<Integer> set = new HashSet<>();
        set.add(0);
        
        for (int num : nums) {
            Set<Integer> newSet = new HashSet<>();
            for (int subsetSum : set) {
                newSet.add(subsetSum + num);
            }
            set.addAll(newSet);
        }
        return set.contains(target);
    }
}
