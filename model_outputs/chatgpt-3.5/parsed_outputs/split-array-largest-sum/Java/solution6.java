class Solution {
    public int splitArray(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        
        for (int num : nums) {
            maxHeap.offer(num);
        }
        
        int left = maxHeap.poll();
        int right = Arrays.stream(nums).sum();
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 1;
            int currentSum = 0;
            
            for (int num : nums) {
                if (currentSum + num > mid) {
                    count++;
                    currentSum = 0;
                }
                currentSum += num;
            }
            
            if (count > k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
}
