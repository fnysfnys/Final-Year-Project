public int numberOfArithmeticSlices(int[] nums) {
    int count = 0;
    int n = nums.length;
    
    for (int start = 0; start < n - 2; start++) {
        int diff = nums[start + 1] - nums[start];
        Map<Integer, Integer> seen = new HashMap<>();
        seen.put(nums[start], 1);
        
        for (int end = start + 2; end < n; end++) {
            if (nums[end] - nums[end - 1] == diff) {
                seen.put(nums[end], seen.getOrDefault(nums[end], 0) + 1);
                if (seen.size() >= 3) {
                    count++;
                }
            } else {
                break;
            }
        }
    }
    
    return count;
}
