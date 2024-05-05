public int maxEnvelopes(int[][] envelopes) {
    Arrays.sort(envelopes, (a, b) -> {
        if (a[0] == b[0]) {
            return b[1] - a[1];
        }
        return a[0] - b[0];
    });

    Set<Integer> set = new HashSet<>();
    for (int[] envelope : envelopes) {
        int h = envelope[1];
        if (!set.contains(h)) {
            set.add(h);
        }
    }

    return set.size();
}
