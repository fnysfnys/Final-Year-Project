class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Stack<int[]> stack = new Stack<>();
        
        for (int[] interval : intervals) {
            if (stack.isEmpty() || interval[0] >= stack.peek()[1]) {
                stack.push(interval);
            }
        }
        
        return intervals.length - stack.size();
    }
}
