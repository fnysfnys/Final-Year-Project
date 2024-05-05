class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] left = twoSum(Arrays.copyOfRange(nums, 0, nums.length / 2));
       int[] right = twoSum(Arrays.copyOfRange(nums, nums.length / 2, nums.length));
       return new int[] {left[0], right[0]};
    }
    
}
