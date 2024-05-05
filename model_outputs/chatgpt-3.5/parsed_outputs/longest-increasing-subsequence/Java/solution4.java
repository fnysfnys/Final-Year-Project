class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> lis = new ArrayList<>();
        for (int num : nums) {
            int pos = Collections.binarySearch(lis, num);
            if (pos < 0) {
                pos = -(pos + 1);
            }
            if (pos == lis.size()) {
                lis.add(num);
            } else {
                lis.set(pos, num);
            }
        }
        return lis.size();
    }
}
