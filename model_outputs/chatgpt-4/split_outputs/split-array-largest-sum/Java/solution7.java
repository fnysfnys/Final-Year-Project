public int splitArray(int[] nums, int k) {
    int left = Arrays.stream(nums).max().getAsInt();
    int right = Arrays.stream(nums).sum();
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (split(nums, mid) > k) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return left;
}

private int split(int[] nums, int max) {
    int count = 1;
    int sum = 0;
    for (int num : nums) {
        if (sum + num > max) {
            sum = num;
            count++;
        } else {
            sum += num;
        }
    }
    return count;
}
