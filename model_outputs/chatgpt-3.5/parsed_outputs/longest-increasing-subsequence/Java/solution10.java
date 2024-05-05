class Solution {
    public int lengthOfLIS(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            if (minHeap.isEmpty() || num > minHeap.peek()) {
                minHeap.offer(num);
            } else {
                minHeap.poll();
                minHeap.offer(num);
            }
        }
        return minHeap.size();
    }
}
