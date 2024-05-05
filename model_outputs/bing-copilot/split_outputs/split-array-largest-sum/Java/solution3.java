public int splitArray(int[] nums, int k) {
    int left = 0, right = 0;
    for (int num : nums) {
        left = Math.max(left, num);
        right += num;
    }
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (isValidSplit(nums, k, mid)) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
}

private boolean isValidSplit(int[] nums, int k, int maxSum) {
    int count = 1;
    int currSum = 0;
    for (int num : nums) {
        currSum += num;
        if (currSum > maxSum) {
            count++;
            currSum = num;
        }
    }
    return count <= k;
}
