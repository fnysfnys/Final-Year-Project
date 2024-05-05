/**
* Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
*/
var countDigitOne = function(n) {
    return Array(n + 1).fill().map((_, i) => i)
            .reduce((acc, num) => acc + num.toString().split('1').length - 1, 0);
};