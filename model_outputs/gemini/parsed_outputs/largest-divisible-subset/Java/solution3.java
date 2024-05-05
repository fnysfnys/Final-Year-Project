class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
      Arrays.sort(nums);
      List<Integer> result = new ArrayList<>();
      for (int num : nums) {
        if (result.isEmpty() || result.get(result.size() - 1) <= num) {
          result.add(num);
        }
      }
      return result;
    }
    
}
