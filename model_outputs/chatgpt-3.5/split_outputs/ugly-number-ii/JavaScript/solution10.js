/**
 * @param {number} n
 * @return {number}
 */
var nthUglyNumber = function(n) {
    const memo = new Map();

    function findNthUglyNumber(index) {
        if (index === 1) return 1;
        if (memo.has(index)) return memo.get(index);

        const nextUgly = Math.min(
            findNthUglyNumber(index - 1) * 2,
            findNthUglyNumber(index - 1) * 3,
            findNthUglyNumber(index - 1) * 5
        );

        memo.set(index, nextUgly);
        return nextUgly;
    }

    return findNthUglyNumber(n);
};
