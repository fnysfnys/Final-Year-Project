class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = 0;
        Deque<Integer> deque = new ArrayDeque<>();
    
        for (int i = 0; i < n; i++) {
            sum += i * nums[i];
            max += nums[i];
            deque.offerLast(i * nums[i]);
        }
    
        int result = sum;
    
        for (int k = 1; k < n; k++) {
            int lastElement = deque.pollLast();
            sum = sum + max - n * nums[n - k];
            deque.offerFirst(lastElement);
            result = Math.max(result, sum);
        }
        return result;
    }
}
