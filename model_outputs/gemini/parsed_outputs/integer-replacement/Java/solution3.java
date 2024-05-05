class Solution {
    public int integerReplacement(int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        int count = 0;
        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num == 1) {
                return count;
            }
            if (num % 2 == 0) {
                stack.push(num / 2);
            } else {
                stack.push(num + 1);
                stack.push(num - 1);
            }
            count++;
        }
        return 0; // should never reach here
    }
    
}
