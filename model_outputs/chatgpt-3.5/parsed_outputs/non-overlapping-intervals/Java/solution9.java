class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        
        int count = 0;
        
        for (int[] interval : intervals) {
            Integer prevEnd = map.floorKey(interval[0]);
            if (prevEnd == null || interval[1] < map.get(prevEnd)) {
                map.put(interval[1], interval[0]);
            } else {
                count++;
            }
        }
        
        return count;
    }
}
