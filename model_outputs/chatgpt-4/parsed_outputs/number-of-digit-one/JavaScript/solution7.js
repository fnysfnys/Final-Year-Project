/**
* Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
*/
var countDigitOne = function(n) {
    let count = 0, multiplier = 1, next = n;
    while (next > 0) {
        let digit = next % 10;
        let roundDown = Math.floor(n / (multiplier * 10)) * multiplier;
        let roundUp = digit === 1 ? (n % multiplier) + 1 : 0;
        count += roundDown + roundUp;
        next = Math.floor(next / 10);
        multiplier *= 10;
    }
    return count;
};