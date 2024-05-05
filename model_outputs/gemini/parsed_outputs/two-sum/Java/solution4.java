class Solution {
    public int[] twoSum(int[] nums, int target) {
      for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        int index = Arrays.binarySearch(nums, i + 1, nums.length, complement);
        if (index >= 0) {
          return new int[] {i, index};
        }
      }
      throw new IllegalArgumentException("No two sum solution");
    }
    
}
