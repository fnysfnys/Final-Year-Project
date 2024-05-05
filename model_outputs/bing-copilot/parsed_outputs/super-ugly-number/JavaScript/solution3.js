var nthSuperUglyNumber = function(n, primes) {
    const uglies = [1];
    const indices = new Array(primes.length).fill(0);

    while (uglies.length < n) {
        let nextUgly = Infinity;
        for (let i = 0; i < primes.length; i++) {
            nextUgly = Math.min(nextUgly, primes[i] * uglies[indices[i]]);
        }
        uglies.push(nextUgly);
        for (let i = 0; i < primes.length; i++) {
            if (nextUgly === primes[i] * uglies[indices[i]]) {
                indices[i]++;
            }
        }
    }
    return uglies[n - 1];
};
