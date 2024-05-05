public int numberOfArithmeticSlices(int[] nums) {
    int count = 0;
    int n = nums.length;
    
    for (int start = 0; start < n - 2; start++) {
        int diff = nums[start + 1] - nums[start];
        Set<Integer> seen = new HashSet<>();
        seen.add(nums[start]);
        
        for (int end = start + 2; end < n; end++) {
            if (nums[end] - nums[end - 1] == diff) {
                seen.add(nums[end]);
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
