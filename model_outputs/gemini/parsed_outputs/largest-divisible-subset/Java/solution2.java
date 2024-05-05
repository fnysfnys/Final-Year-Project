class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
      List<Integer> result = new ArrayList<>();
      Arrays.sort(nums);
      backtrack(nums, 0, result, new ArrayList<>());
      return result;
    }
    
    private void backtrack(int[] nums, int index, List<Integer> current, List<Integer> result) {
      if (current.size() > result.size()) {
        result.clear();
        result.addAll(current);
      }
      for (int i = index; i < nums.length; i++) {
        if (current.isEmpty() || nums[i] % current.get(current.size() - 1) == 0 || current.get(current.size() - 1) % nums[i] == 0) {
          current.add(nums[i]);
          backtrack(nums, i + 1, current, result);
          current.remove(current.size() - 1);
        }
      }
    }
    
}
