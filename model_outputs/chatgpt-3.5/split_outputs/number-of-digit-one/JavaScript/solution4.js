var countDigitOne = function(n) {
    if (n <= 0) return 0;
    let str = n.toString();
    let firstDigit = parseInt(str[0]);
    let remainingDigits = parseInt(str.slice(1));
    let totalCount = 0;
    
    if (firstDigit === 1) {
        totalCount += remainingDigits + 1;
    } else if (firstDigit > 1) {
        totalCount += Math.pow(10, str.length - 1);
    }
    
    totalCount += firstDigit * countDigitOne(Math.pow(10, str.length - 1) - 1);
    totalCount += countDigitOne(remainingDigits);
    
    return totalCount;
};
