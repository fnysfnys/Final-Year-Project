public int maxEnvelopes(int[][] envelopes) {
    Arrays.sort(envelopes, (a, b) -> {
        if (a[0] == b[0]) {
            return b[1] - a[1];
        }
        return a[0] - b[0];
    });

    return (int) Arrays.stream(envelopes).mapToInt(envelope -> envelope[1]).distinct().count();
}
