public int numberOfArithmeticSlices(int[] nums) {
    int n = nums.length;
    int count = 0;
    
    for (int i = 0; i < n - 2; i++) {
        int diff = nums[i + 1] - nums[i];
        int j = i + 2;
        
        while (j < n && nums[j] - nums[j - 1] == diff) {
            count += 1;
            j += 1;
        }
    }
    
    return count;
}
