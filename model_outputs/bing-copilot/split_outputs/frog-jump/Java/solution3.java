public boolean canCross(int[] stones) {
    int n = stones.length;
    Map<Integer, Set<Integer>> jumpMap = new HashMap<>();
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(0);
    jumpMap.put(0, new HashSet<>());
    jumpMap.get(0).add(0);

    while (!queue.isEmpty()) {
        int currPos = queue.poll();
        for (int jump : jumpMap.get(currPos)) {
            for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {
                if (nextJump > 0) {
                    int nextPos = currPos + nextJump;
                    if (nextPos == n - 1) {
                        return true;
                    }
                    if (Arrays.binarySearch(stones, nextPos) >= 0 && !jumpMap.containsKey(nextPos)) {
                        queue.offer(nextPos);
                        jumpMap.computeIfAbsent(nextPos, k -> new HashSet<>()).add(nextJump);
                    }
                }
            }
        }
    }
    return false;
}
