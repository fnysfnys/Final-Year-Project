class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        int left = 0, right = sortedNums.length - 1;
        while (left < right) {
            int sum = sortedNums[left] + sortedNums[right];
            if (sum == target) {
                int index1 = indexOf(nums, sortedNums[left]);
                int index2 = indexOf(nums, sortedNums[right]);
                return new int[] {index1, index2};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null; // No valid solution found.
    }
    
    private int indexOf(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
