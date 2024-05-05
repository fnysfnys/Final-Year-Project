public class Solution {
    /**
     * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
     * 
     * Example:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                duplicates.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }
        return duplicates;
    }
}
