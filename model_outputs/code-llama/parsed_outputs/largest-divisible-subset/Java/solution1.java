class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
       List<Integer> result = new ArrayList<>();
       for (int i = 0; i < nums.length; i++) {
           for (int j = i + 1; j < nums.length; j++) {
               if (nums[i] % nums[j] == 0) {
                   result.add(nums[j]);
               }
           }
       }
       return result;
    }
    
}
