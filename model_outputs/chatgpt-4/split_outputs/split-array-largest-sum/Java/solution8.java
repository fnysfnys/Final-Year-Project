public int splitArray(int[] nums, int k) {
    int max = 0, sum = 0;
    for (int num : nums) {
        max = Math.max(max, num);
        sum += num;
    }
    int left = max, right =

sum;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (canSplit(nums, k, mid)) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
}

private boolean canSplit(int[] nums, int k, int maxSum) {
    int currentSum = 0, subarrays = 1;
    for (int num : nums) {
        currentSum += num;
        if (currentSum > maxSum) {
            currentSum = num;
            subarrays++;
            if (subarrays > k) return false;
        }
    }
    return true;
}
