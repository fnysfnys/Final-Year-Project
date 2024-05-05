public List<Integer> largestDivisibleSubset(int[] nums) {
  Arrays.sort(nums);
  int n = nums.length;
  int[] dp = new int[n];
  int[] prev = new int[n];
  int maxIndex = 0;
  for (int i = 1; i < n; i++) {
    for (int j = 0; j < i; j++) {
      if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
        dp[i] = dp[j] + 1;
        prev[i] = j;
      }
    }
    if (dp[i] > dp[maxIndex]) {
      maxIndex = i;
    }
  }
  List<Integer> result = new ArrayList<>();
  int i = maxIndex;
  while (i >= 0) {
    result.add(nums[i]);
    i = prev[i];
  }
  return result;
}
