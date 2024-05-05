class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (stack.size() >= 2) {
                int diff1 = nums[i] - stack.peek();
                int diff2 = stack.peek() - stack.get(stack.size() - 2);
                if (diff1 == diff2) {
                    count++;
                } else {
                    break;
                }
                stack.pop();
            }
            stack.push(nums[i]);
        }
        return count;
    }
    
}
