class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < i; j++) {
                long diff = (long) nums[i] - nums[j];
                if (diff <= Integer.MIN_VALUE || diff >= Integer.MAX_VALUE) continue;
                
                int d = (int) diff;
                int prevCount = map.getOrDefault(d, 0);
                count += prevCount;
                map.put(d, prevCount + 1);
            }
        }
        
        return count;
    }
}
