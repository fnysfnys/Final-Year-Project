public int integerReplacement(int n) {
    Map<Integer, Integer> memo = new HashMap<>();
    return helper(n, memo);
}

private int helper(int n, Map<Integer, Integer> memo) {
    if (n == 1) return 0;
    if (memo.containsKey(n)) return memo.get(n);
    
    int count;
    if (n % 2 == 0) {
        count = 1 + helper(n / 2, memo);
    } else {
        count = 1 + Math.min(helper(n + 1, memo), helper(n - 1, memo));
    }
    
    memo.put(n, count);
    return count;
}
