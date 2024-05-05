class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
       List<Integer> result = new ArrayList<>();
       for (int i = 0; i < nums.length; i++) {
           if (nums[i] % nums[i - 1] == 0) {
               result.add(nums[i]);
           }
       }
       return result;
    }
    
}
