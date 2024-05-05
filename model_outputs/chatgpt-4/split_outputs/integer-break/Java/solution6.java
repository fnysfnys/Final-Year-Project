class Solution {
    public int integerBreak(int n) {
        switch (n) {
            case 2: return 1;
            case 3: return 2;
            default: {
                int product = 1;
                while (n > 4) {
                    product *= 3;
                    n -= 3;
                }
                return product * n;
            }
        }
    }
}
