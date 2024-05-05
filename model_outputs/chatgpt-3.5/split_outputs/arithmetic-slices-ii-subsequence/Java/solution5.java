public int numberOfArithmeticSlices(int[] nums) {
    int n = nums.length;
    int count = 0;
    
    for (int i = 0; i < n; i++) {
        Set<Long> set = new HashSet<>();
        for (int j = 0; j < i; j++) {
            long diff = (long) nums[i] - nums[j];
            if (diff <= Integer.MIN_VALUE || diff >= Integer.MAX_VALUE) continue;
            
            set.add(diff);
        }
        
        count += set.size();
    }
    
    return count;
}
