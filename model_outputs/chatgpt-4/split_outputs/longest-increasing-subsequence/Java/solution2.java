public int lengthOfLIS(int[] nums) {
    ArrayList<Integer> piles = new ArrayList<>();
    for (int num : nums) {
        int index = Collections.binarySearch(piles, num);
        if (index < 0) {
            index = -(index + 1);
        }
        if (index == piles.size()) {
            piles.add(num);
        } else {
            piles.set(index, num);
        }
    }
    return piles.size();
}
