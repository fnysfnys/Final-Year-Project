public int countDigitOneDigits(int n) {
    int count = 0;
    for (long factor = 1; factor <= n; factor *= 10) {
        long currDigit = (n / factor) % 10;
        long higherDigits = n / (factor * 10);
        long lowerDigits = n % factor;
        if (currDigit == 0) {
            count += higherDigits * factor;
        } else if (currDigit == 1) {
            count += higherDigits * factor + lowerDigits + 1;
        } else {
            count += (higherDigits + 1) * factor;
        }
    }
    return count;
}
