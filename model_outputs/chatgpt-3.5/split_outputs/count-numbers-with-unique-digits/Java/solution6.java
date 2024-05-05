public int countNumbersWithUniqueDigits(int n) {
    if (n == 0) return 1;
    if (n == 1) return 10;
    int result = 10;
    int uniqueDigits = 9;
    for (int i = 2; i <= n && i <= 10; i++) {
        uniqueDigits *= getUniqueDigitCount(i);
        result += uniqueDigits;
    }
    return result;
}

private int getUniqueDigitCount(int m) {
    int count = 9;
    for (int i = 9; i >= 11 - m; i--) {
        count *= i;
    }
    return count;
}
