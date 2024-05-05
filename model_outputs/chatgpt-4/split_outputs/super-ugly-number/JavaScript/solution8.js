var nthSuperUglyNumber = function(n, primes) {
    let generated = [1];
    let indices = primes.map(() => 0);

    while (generated.length < n) {
        let nextUgly = Math.min(...primes.map((prime, i) => prime * generated[indices[i]]));
        primes.forEach((prime, i) => {
            if (nextUgly === prime * generated[indices[i]]) indices[i]++;
        });
        generated.push(nextUgly);
    }

    return generated[n - 1];
};
