class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n == 1) return 10;
        int result = 10;
        int uniqueDigits = 9;
        for (int i = 2; i <= n && i <= 10; i++) {
            switch (i) {
                case 2: uniqueDigits *= 9; break;
                case 3: uniqueDigits *= 8; break;
                case 4: uniqueDigits *= 7; break;
                case 5: uniqueDigits *= 6; break;
                case 6: uniqueDigits *= 5; break;
                case 7: uniqueDigits *= 4; break;
                case 8: uniqueDigits *= 3; break;
                case 9: uniqueDigits *= 2; break;
                case 10: uniqueDigits *= 1; break;
            }
            result += uniqueDigits;
        }
        return result;
    }
}
