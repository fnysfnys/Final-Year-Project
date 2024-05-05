var nthSuperUglyNumber = function(n, primes) {
    let ugly = new Array(n);
    ugly[0] = 1;

    let pointers = new Array(primes.length).fill(0);

    for (let i = 1; i < n; i++) {
        let minVal = Number.MAX_SAFE_INTEGER;
        for (let j = 0; j < primes.length; j++) {
            minVal = Math.min(minVal, ugly[pointers[j]] * primes[j]);
        }

        ugly[i] = minVal;

        for (let j = 0; j < primes.length; j++) {
            if (ugly[pointers[j]] * primes[j] === minVal) {
                pointers[j]++;
            }
        }
    }

    return ugly[n - 1];
};