/**
 * @param {number} n
 * @return {number}
 */
var nthUglyNumber = function(n) {
    const uglyNumbers = [1];
    let i2 = 0, i3 = 0, i5 = 0;

    while (uglyNumbers.length < n) {
        const nextUgly = Math.min(uglyNumbers[i2] * 2, uglyNumbers[i3] * 3, uglyNumbers[i5] * 5);
        uglyNumbers.push(nextUgly);

        if (nextUgly === uglyNumbers[i2] * 2) i2++;
        if (nextUgly === uglyNumbers[i3] * 3) i3++;
        if (nextUgly === uglyNumbers[i5] * 5) i5++;
    }

    return uglyNumbers.pop();
};
