private Map<Integer, Integer> memo = new HashMap<>();

public int integerReplacement(int n) {
    if (memo.containsKey(n)) {
        return memo.get(n);
    }
    if (n == 1) {
        return 0;
    }
    if (n % 2 == 0) {
        memo.put(n, 1 + integerReplacement(n / 2));
    } else {
        memo.put(n, Math.min(1 + integerReplacement(n + 1), 1 + integerReplacement(n - 1)));
    }
    return memo.get(n);
}
