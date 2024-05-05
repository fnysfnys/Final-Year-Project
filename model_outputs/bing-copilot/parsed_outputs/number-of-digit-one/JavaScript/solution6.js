var countDigitOne = function(n) {
    if (n < 10) {
        return n >= 1 ? 1 : 0;
    }
    const lastDigit = n % 10;
    const remainingDigits = Math.floor(n / 10);
    const countRest = countDigitOne(remainingDigits);
    return countRest + (lastDigit === 1 ? remainingDigits + 1 : 0);
};
