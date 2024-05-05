public int maxEnvelopes(int[][] envelopes) {
    Arrays.sort(envelopes, (a, b) -> {
        if (a[0] == b[0]) {
            return b[1] - a[1];
        }
        return a[0] - b[0];
    });

    Map<Integer, Integer> map = new HashMap<>();
    for (int[] envelope : envelopes) {
        int h = envelope[1];
        map.put(h, map.getOrDefault(h, 0) + 1);
    }

    return map.size();
}
