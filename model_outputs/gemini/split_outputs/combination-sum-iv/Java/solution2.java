Map<Integer, Integer> memo = new HashMap<>();

public int combinationSum4(int[] nums, int target) {
  if (memo.containsKey(target)) {
    return memo.get(target);
  }
  int count = 0;
  if (target == 0) {
    return 1;
  }
  for (int num : nums) {
    if (target - num >= 0) {
      count += combinationSum4(nums, target - num);
    }
  }
  memo.put(target, count);
  return count;
}
