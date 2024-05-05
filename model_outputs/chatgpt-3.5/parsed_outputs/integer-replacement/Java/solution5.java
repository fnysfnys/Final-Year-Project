class Solution {
    public int integerReplacement(int n) {
        if (n == 1) return 0;
        
        Queue<Long> queue = new LinkedList<>();
        queue.offer((long)n);
        int steps = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                long current = queue.poll();
                if (current == 1) return steps;
                if (current % 2 == 0) {
                    queue.offer(current / 2);
                } else {
                    queue.offer(current + 1);
                    queue.offer(current - 1);
                }
            }
            steps++;
        }
        
        return -1; // This should not be reached
    }
}
