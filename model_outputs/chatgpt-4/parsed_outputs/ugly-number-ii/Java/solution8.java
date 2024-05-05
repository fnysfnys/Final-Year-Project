class Solution {
    int[] memo;

    public int nthUglyNumber(int n) {
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return helper(n);
    }
    
    private int helper(int n) {
        if (n <= 1) return 1;
        if (memo[n] != -1) return memo[n];
        int count = 1, num = 1;
        while (count < n) {
            num++;
            if (isUgly(num)) count++;
        }
        memo[n] = num;
        return num;
    }
    
    private boolean isUgly(int num) {
        for (int i : new int[]{2, 3, 5}) {
            while (num % i == 0) num /= i;
        }
        return num == 1;
    }
}
