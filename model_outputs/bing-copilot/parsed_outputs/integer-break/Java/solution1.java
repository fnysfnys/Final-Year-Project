class Solution {
    public int integerBreak(int n) {
            if (n <= 3) return n - 1;
            int threes = n / 3;
            int remainder = n % 3;
            if (remainder == 1) {
                remainder = 4;
                if (threes > 1) threes--;
            }
            return (int) (Math.pow(3, threes) * remainder);
        }
        
}
