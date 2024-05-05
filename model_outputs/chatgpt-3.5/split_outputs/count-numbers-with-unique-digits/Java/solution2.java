public int countNumbersWithUniqueDigits(int n) {
    if (n == 0) return 1;
    if (n == 1) return 10;
    int uniqueDigits = 9;
    int availableDigits = 9;
    return uniqueDigits * countNumbersWithUniqueDigits(n - 1, availableDigits) + 10;
}

private int countNumbersWithUniqueDigits(int n, int availableDigits) {
    if (n == 1) return availableDigits;
    uniqueDigits *= availableDigits;
    return uniqueDigits * countNumbersWithUniqueDigits(n - 1, availableDigits - 1);
}
