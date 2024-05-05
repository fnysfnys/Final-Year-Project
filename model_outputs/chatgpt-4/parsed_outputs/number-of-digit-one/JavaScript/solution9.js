/**
* Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
*/
var countDigitOne = function(n) {
    if (n <= 0) return 0;
    if (n < 10) return 1;
    let lastDigit = n % 10;
    let rest = Math.floor(n / 10);
    return countDigitOne(rest) * 10 + countDigitOne(lastDigit) + (lastDigit >= 1 ? rest + 1 : 0);
};