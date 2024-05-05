class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();
    
    public int integerBreak(int n) {
        if (n < 2) return 0;
        if (memo.containsKey(n)) return memo.get(n);
        int max = 0;
        for (int i = 1; i < n; i++) {
            max = Math.max(max, Math.max(i * (n - i), i * integerBreak(n - i)));
        }
        memo.put(n, max);
        return max;
    }
}
