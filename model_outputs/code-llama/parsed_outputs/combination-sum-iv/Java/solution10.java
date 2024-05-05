class Solution {
    public int combinationSum4(int[] nums, int target) {
       Map<Integer, Integer> memo = new HashMap<>();
       return combinationSum4(nums, target, memo);
    }
    
    private int combinationSum4(int[] nums, int target, Map<Integer, Integer> memo) {
       if (target == 0) {
           return 1;
       }
       int count = 0;
       for (int i = 0; i < nums.length; i++) {
           if (memo.containsKey(target - nums[i])) {
               count += memo.get(target - nums[i]);
           } else {
               count += combinationSum4(nums, target - nums[i], memo);
               memo.put(target - nums[i], count);
           }
       }
       return count;
    }
    
}
