public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
    Map<Integer, Integer> map = new HashMap<>();
    int count = 0;
    
    for (int[] interval : intervals) {
        if (map.containsKey(interval[0]) && map.get(interval[0]) <= interval[1]) {
            count++;
            continue;
        }
        
        map.put(interval[1], interval[0]);
    }
    
    return count;
}
