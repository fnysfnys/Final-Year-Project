class Solution {
    public int nthUglyNumber(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
    
        int next = 1;
        int num = 2;
        while (next < n) {
            if (isUgly(num)) {
                next++;
            }
            if (next < n) {
                num++;
            }
        }
        return num;
    }
    
    private boolean isUgly(int num) {
        if (num <= 0) return false;
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;
    }
}
