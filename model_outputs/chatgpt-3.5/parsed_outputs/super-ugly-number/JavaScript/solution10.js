var nthSuperUglyNumber = function(n, primes) {
    let ugly = [1];
    let set = new Set(ugly);

    let i = 1;
    while (ugly.length < n) {
        let minVal = Number.MAX_SAFE_INTEGER;

        for (let prime of primes) {
            minVal = Math.min(minVal, prime * ugly[i - 1]);
        }

        if (!set.has(minVal)) {
            set.add(minVal);
            ugly.push(minVal);
        }

        i++;
    }

    return ugly[n - 1];
};