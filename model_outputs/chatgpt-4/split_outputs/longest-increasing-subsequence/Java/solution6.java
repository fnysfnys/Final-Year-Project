public int lengthOfLIS(int[] nums) {
    int[] lis = new int[nums.length];
    int max = 0;
    for (int num : nums) {
        int i = 0;
        while (i < max && lis[i] < num) {
            i++;
        }
        lis[i] = num;
        if (i == max) {
            max

++;
        }
    }
    return max;
}
