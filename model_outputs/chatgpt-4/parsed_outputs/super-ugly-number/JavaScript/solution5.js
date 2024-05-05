var nthSuperUglyNumber = function(n, primes) {
    let memo = {};

    function helper(m) {
        if (m in memo) return memo[m];
        if (m === 1) return 1;

        let minUgly = Infinity;
        for (let prime of primes) {
            if (m % prime === 0) {
                minUgly = Math.min(minUgly, helper(m / prime));
            }
        }

        memo[m] = minUgly;
        return minUgly;
    }

    let count = 0, num = 1;
    while (count < n) {
        if (helper(num) === 1) count++;
        num++;
    }

    return num - 1;
};