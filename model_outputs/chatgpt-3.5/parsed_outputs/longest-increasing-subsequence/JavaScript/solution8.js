/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function(nums) {
    if (nums.length === 0) return 0;
    const pq = new PriorityQueue();
    
    for (const num of nums) {
        if (pq.isEmpty() || num > pq.peek()) {
            pq.offer(num);
        } else {
            pq.poll();
            pq.offer(num);
        }
    }
    
    return pq.size();
};