/**
 * @param {number} n
 * @return {number}
 */
var nthUglyNumber = function(n) {
    const uglyNumbers = [1];
    let p2 = 0, p3 = 0, p5 = 0;

    while (uglyNumbers.length < n) {
        const nextUgly = Math.min(uglyNumbers[p2] * 2, uglyNumbers[p3] * 3, uglyNumbers[p5] * 5);
        uglyNumbers.push(nextUgly);

        if (nextUgly === uglyNumbers[p2] * 2) p2++;
        if (nextUgly === uglyNumbers[p3] * 3) p3++;
        if (nextUgly === uglyNumbers[p5] * 5) p5++;
    }

    return uglyNumbers[n - 1];
};
