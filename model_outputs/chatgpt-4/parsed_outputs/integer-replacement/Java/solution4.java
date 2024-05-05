class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();

    public int integerReplacement(int n) {
        if (n == 1) {
            return 0;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result;
        if (n % 2 == 0) {
            result = 1 + integerReplacement(n / 2);
        } else {
            result = 2 + Math.min(integerReplacement(n / 2), integerReplacement(n / 2 + 1));
        }
        memo.put(n, result);
        return result;
    }
}