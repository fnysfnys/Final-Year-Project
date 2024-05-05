public int lengthOfLIS(int[] nums) {
    Stack<Integer> stack = new Stack<>();
    for (int num : nums) {
        if (stack.isEmpty() || num > stack.peek()) {
            stack.push(num);
        } else {
            int index = binarySearch(stack, num);
            stack.set(index, num);
        }
    }
    return stack.size();
}

private int binarySearch(Stack<Integer> stack, int target) {
    int left = 0, right = stack.size() - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (stack.get(mid) < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return left;
}
