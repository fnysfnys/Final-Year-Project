var nthSuperUglyNumber = function(n, primes) {
    let ugly = [1];



    let i = 1;
    while (ugly.length < n) {
        let minVal = Number.MAX_SAFE_INTEGER;

        for (let prime of primes) {
            for (let num of ugly) {
                let nextUgly = prime * num;
                if (nextUgly > ugly[ugly.length - 1]) {
                    minVal = Math.min(minVal, nextUgly);
                }
            }
        }

        ugly.push(minVal);
        i++;
    }

    return ugly[n - 1];
};
