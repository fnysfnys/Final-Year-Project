public int lengthOfLIS(int[] nums) {
    TreeSet<Integer> set = new TreeSet<>();
    for (int num : nums) {
        Integer ceil = set.ceiling(num);
        if (ceil != null) {
            set.remove(ceil);
        }
        set.add(num);
    }
    return set.size();
}
