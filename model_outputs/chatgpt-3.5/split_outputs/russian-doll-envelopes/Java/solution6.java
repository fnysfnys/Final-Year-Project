public int maxEnvelopes(int[][] envelopes) {
    Arrays.sort(envelopes, (a, b) -> {
        if (a[0] == b[0]) {
            return b[1] - a[1];
        }
        return a[0] - b[0];
    });

    int n = envelopes.length;
    Deque<Integer> deque = new LinkedList<>();

    for (int i = 0; i < n; i++) {
        int idx = Collections.binarySearch(deque, envelopes[i][1]);
        if (idx < 0) {
            idx = -(idx + 1);
        }
        if (idx == deque.size()) {
            deque.add(envelopes[i][1]);
        } else {
            deque.set(idx, envelopes[i][1]);
        }
    }

    return deque.size();
}
