public int countNumbersWithUniqueDigits(int n) {
    if (n == 0) return 1;
    if (n == 1) return 10;
    int result = 10;
    for (int i = 2; i <= n && i <= 10; i++) {
        int uniqueDigits = 9;
        for (int j = 9; j > 10 - i; j--) {
            uniqueDigits *= j;
        }
        result += uniqueDigits;
    }
    return result;
}
