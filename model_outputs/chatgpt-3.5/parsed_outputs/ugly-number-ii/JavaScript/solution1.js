/**
 * @param {number} n
 * @return {number}
 */
var nthUglyNumber = function(n) {
    const uglyNumbers = new Set([1]);
    let num = 2;

    while (uglyNumbers.size < n) {
        if (isUgly(num)) {
            uglyNumbers.add(num);
        }
        num++;
    }

    return Array.from(uglyNumbers).pop();
};

function isUgly(num) {
    while (num % 2 === 0) {
        num /= 2;
    }
    while (num % 3 === 0) {
        num /= 3;
    }
    while (num % 5 === 0) {
        num /= 5;
    }
    return num === 1;
}