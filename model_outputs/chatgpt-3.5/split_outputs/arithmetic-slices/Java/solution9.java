public int numberOfArithmeticSlices(int[] nums) {
    int count = 0;
    
    for (int start = 0; start < nums.length - 2; start++) {
        int diff = nums[start + 1] - nums[start];
        int finalStart = start;
        
        long subarrayCount = IntStream.range(start + 2, nums.length)
            .takeWhile(end -> nums[end] - nums[end - 1] == diff)
            .mapToObj(end -> end - finalStart - 1)
            .filter(len -> len >= 2)
            .count();
        
        count += subarrayCount;
    }
    
    return count;
}
