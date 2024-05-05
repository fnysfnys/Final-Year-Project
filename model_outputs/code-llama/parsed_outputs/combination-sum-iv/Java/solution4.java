class Solution {
    public int combinationSum4(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
       }
       int count = 0;
       for (int i = 0; i < nums.length; i++) {
           if (map.containsKey(target - nums[i])) {
               count++;
           }
       }
       return count;
    }
    
}
