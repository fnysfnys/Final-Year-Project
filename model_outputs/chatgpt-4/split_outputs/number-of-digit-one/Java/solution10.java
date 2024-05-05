public int countDigitOne(int n) {
    int count = 0, factor = 1;
    int lowerNum = 0, currDigit = 0, higherNum = 0;

    while (n / factor != 0) {
        lowerNum = n - (n / factor) * factor;
        currDigit = (n / factor) % 10;
        higherNum = n / (factor * 10);

        if (currDigit == 0) count += higherNum * factor;
        else if (currDigit == 1) count += higherNum * factor + lowerNum + 1;
        else count += (higherNum + 1) * factor;

        factor *= 10;
    }
    return count;
}
