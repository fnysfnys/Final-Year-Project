/**
 * @param {number} n
 * @return {number}
 */
var nthUglyNumber = function(n) {
    function* generateUglyNumbers() {
        const uglyNumbers = [1];
        let i2 = 0, i3 = 0, i5 = 0;

        while (true) {
            const nextUgly = Math.min(uglyNumbers[i2] * 2, uglyNumbers[i3] * 3, uglyNumbers[i5] * 5);
            uglyNumbers.push(nextUgly);

            if (nextUgly === uglyNumbers[i2] * 2) i2++;
            if (nextUgly === uglyNumbers[i3] * 3) i3++;
            if (nextUgly === uglyNumbers[i5] * 5) i5++;

            yield uglyNumbers[uglyNumbers.length - 1];
        }
    }

    const generator = generateUglyNumbers();
    for (let i = 1; i < n; i++) {
        generator.next();
    }

    return generator.next().value;
};
