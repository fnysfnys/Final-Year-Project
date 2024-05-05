class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < nums.length; i++) {
            while (stack.size() >= 2) {
                int a = stack.pop();
                int b = stack.peek();
                if (nums[i] - b == b - a) {
                    count++;
                } else {
                    stack.push(a);
                    break;
                }
            }
            stack.push(nums[i]);
        }
        
        return count;
    }
}
