public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
    if (desiredTotal <= 0) return true;
    int maxSum = maxChoosableInteger * (maxChoosableInteger + 1) / 2;
    if (maxSum < desiredTotal) return false;

    List<Integer> pool = new ArrayList<>();
    for (int i = 1; i <= maxChoosableInteger; i++) {
        pool.add(i);
    }

    Collections.sort(pool, Collections.reverseOrder());
    return canWin(pool, desiredTotal, new HashMap<>());
}

private boolean canWin(List<Integer> pool, int total, Map<List<Integer>, Boolean> memo) {
    if (!pool.isEmpty() && pool.get(0) >= total) return true;
    if (memo.containsKey(pool)) return memo.get(pool);

    for (int i = 0; i < pool.size(); i++) {
        int removed = pool.remove(i);
        if (!canWin(pool, total - removed, memo)) {
            pool.add(i, removed);
            memo.put(new ArrayList<>(pool), true);
            return true;
        }
        pool.add(i, removed);
    }

    memo.put(new ArrayList<>(pool), false);
    return false;
}
