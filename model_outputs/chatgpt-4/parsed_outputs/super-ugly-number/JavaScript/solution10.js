var nthSuperUglyNumber = function(n, primes) {
    let uglyNumbers = [1];
    let count = 1;
    let next = 2;

    while (count < n) {
        let isUgly = primes.some(prime => {
            let temp = next;
            while (temp % prime === 0) temp /= prime;
            return temp === 1;
        });

        if (isUgly) {
            uglyNumbers.push(next);
            count++;
        }
        next++;
    }

    return uglyNumbers[n - 1];
};