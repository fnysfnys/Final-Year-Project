class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false; // If the total sum is odd, partition is not possible.
        }
        int target = sum / 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        
        for (int num : nums) {
            int size = pq.size();
            for (int i = 0; i < size; i++) {
                int subsetSum = pq.poll();
                pq.add(subsetSum + num);
                pq.add(subsetSum);
            }
        }
        return pq.contains(target);
    }
}
