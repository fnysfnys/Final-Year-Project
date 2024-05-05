class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] original = nums.clone();
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(target - num, num);
       
    
     }
        for (int num : nums) {
            if (map.containsKey(num)) {
                int num1Index = findIndex(original, num);
                int num2Index = findIndex(original, map.get(num), num1Index);
                return new int[] { num1Index, num2Index };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    private int findIndex(int[] nums, int target, int excludeIndex) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && i != excludeIndex) {
                return i;
            }
        }
        return -1;
    }
}
