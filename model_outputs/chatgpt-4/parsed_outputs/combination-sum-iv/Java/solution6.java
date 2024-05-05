class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();
    
    public int combinationSum4(int[] nums, int target) {
        if (target == 0) return 1;
        if (memo.containsKey(target)) return memo.get(target);
    
        int count = 0;
        for (int num : nums) {
            if (num > 0 && target >= num) {
                count += combinationSum4(nums, target - num);
            }
        }
        memo.put(target, count);
        return count;
    }
}
