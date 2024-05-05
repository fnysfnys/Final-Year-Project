class Solution {
    public int nthUglyNumber(int n) {
        if (n <= 0) return 0;
        int count = 0, i = 1;
        while (count < n) {
            if (isUgly(i)) count++;
            if (count < n) i++;
        }
        return i;
    }
    
    private boolean isUgly(int num) {
        if (num <= 0) return false;
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;
    }
}
