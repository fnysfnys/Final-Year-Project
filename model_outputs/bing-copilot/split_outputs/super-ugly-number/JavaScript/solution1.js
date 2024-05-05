var nthSuperUglyNumber = function(n, primes) {
    const isSuperUgly = (num) => {
        for (const prime of primes) {
            while (num % prime === 0) {
                num /= prime;
            }
        }
        return num === 1;
    };

    let count = 0;
    let num = 1;
    while (count < n) {
        if (isSuperUgly(num)) {
            count++;
        }
        num++;
    }
    return num - 1;
};
