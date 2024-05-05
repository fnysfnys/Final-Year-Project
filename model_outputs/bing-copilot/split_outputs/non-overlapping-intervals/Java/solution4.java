public int eraseOverlapIntervals(int[][] intervals) {
    if (intervals == null || intervals.length == 0) {
        return 0;
    }
    
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
    
    for (int[] interval : intervals) {
        pq.offer(interval);
    }
    
    int count = 0;
    int prevEnd = Integer.MIN_VALUE;
    
    while (!pq.isEmpty()) {
        int[] curr = pq.poll();
        if (curr[0] >= prevEnd) {
            prevEnd = curr[1];
        } else {
            count++;
        }
    }
    
    return count;
}
