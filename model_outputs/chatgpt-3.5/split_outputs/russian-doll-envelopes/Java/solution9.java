public int maxEnvelopes(int[][] envelopes) {
    Arrays.sort(envelopes, (a, b) -> {
        if (a[0] == b[0]) {
            return b[1] - a[1];
        }
        return a[0] - b[0];
    });

    List<Integer> list = new ArrayList<>();
    for (int[] envelope : envelopes) {
        int h = envelope[1];
        if (!list.contains(h)) {
            list.add(h);
        }
    }

    return list.size();
}
