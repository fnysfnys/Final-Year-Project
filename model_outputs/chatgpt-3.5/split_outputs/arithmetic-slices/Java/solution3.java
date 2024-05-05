public int numberOfArithmeticSlices(int[] nums) {
    int count = 0;
    int diff = nums[1] - nums[0];
    int length = 2;
    
    for (int i = 2; i < nums.length; i++) {
        if (nums[i] - nums[i - 1] == diff) {
            length++;
        } else {
            if (length >= 3) {
                count += ((length - 1) * (length - 2)) / 2;
            }
            diff = nums[i] - nums[i - 1];
            length = 2;
        }
    }
    
    if (length >= 3) {
        count += ((length - 1) * (length - 2)) / 2;
    }
    
    return count;
}
