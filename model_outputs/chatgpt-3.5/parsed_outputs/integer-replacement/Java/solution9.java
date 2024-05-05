class Solution {
    public int integerReplacement(int n) {
        if (n == 1) return 0;
        
        Stack<Long> stack = new Stack<>();
        stack.push((long)n);
        int steps = 0;
        
        while (!stack.isEmpty()) {
            long current = stack.pop();
            if (current == 1) return steps;
            if (current % 2 == 0) {
                stack.push(current / 2);
            } else {
                stack.push(current + 1);
                stack.push(current - 1);
            }
            steps++;
        }
        
        return -1; // This should not be reached
    }
}
