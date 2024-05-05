public int splitArray(int[] nums, int k) {
    int max = 0, sum = 0;
    for (int num : nums) {
        max = Math.max(max, num);
        sum += num;
    }
    return binarySearch(nums, k, max, sum);
}

private int binarySearch(int[] nums, int k, int low, int high) {
    while (low < high) {
        int mid = low + (high - low) / 2;
        if (needMoreSubarrays(nums, k, mid)) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }
    return low;
}

private boolean needMoreSubarrays(int[] nums, int k, int maxSumLimit) {
    int sum = 0, count = 1;
    for (int num : nums) {
        if (sum + num > maxSumLimit) {
            sum = num;
            count++;
            if (count > k) {
                return true;
            }
        } else {
            sum += num;
        }
    }
    return false;
}
