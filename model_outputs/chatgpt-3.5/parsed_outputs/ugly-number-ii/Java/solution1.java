class Solution {
    public int nthUglyNumber(int n) {
        if (n <= 0) return 0;
        int count = 1;
        int num = 1;
        while (count < n) {
            num++;
            if (isUgly(num)) {
                count++;
            }
        }
        return num;
    }
    
    private boolean isUgly(int num) {
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }
}
