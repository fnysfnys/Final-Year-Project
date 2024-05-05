/**
 * @param {number} n
 * @return {number}
 */
var nthUglyNumber = function(n) {
    const uglyNumbers = [1];
    let i2 = 0, i3 = 0, i5 = 0;

    for (let i = 1; i < n; i++) {
        let nextUgly = uglyNumbers[i2] * 2;
        while (nextUgly <= uglyNumbers[i - 1]) {
            i2++;
            nextUgly = uglyNumbers[i2] * 2;
        }

        nextUgly = uglyNumbers[i3] * 3;
        while (nextUgly <= uglyNumbers[i - 1]) {
            i3++;
            nextUgly = uglyNumbers[i3] * 3;
        }

        nextUgly = uglyNumbers[i5]

 * 5;
        while (nextUgly <= uglyNumbers[i - 1]) {
            i5++;
            nextUgly = uglyNumbers[i5] * 5;
        }

        uglyNumbers.push(Math.min(uglyNumbers[i2] * 2, uglyNumbers[i3] * 3, uglyNumbers[i5] * 5));
    }

    return uglyNumbers[n - 1];
};
