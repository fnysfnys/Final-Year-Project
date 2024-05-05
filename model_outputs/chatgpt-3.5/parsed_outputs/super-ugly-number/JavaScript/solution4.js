var nthSuperUglyNumber = function(n, primes) {
    let ugly = [1];
    let set = new Set(ugly);

    while (ugly.length < n) {
        let minVal = Number.MAX_SAFE_INTEGER;

        for (let prime of primes) {
            for (let num of ugly) {
                let nextUgly = prime * num;
                if (!set.has(nextUgly)) {
                    set.add(nextUgly);
                    minVal = Math.min(minVal, nextUgly);
                }
            }
        }

        ugly.push(minVal);
    }

    return ugly[n - 1];
};