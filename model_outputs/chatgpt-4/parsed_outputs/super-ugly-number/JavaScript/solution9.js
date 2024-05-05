var nthSuperUglyNumber = function(n, primes) {
    let left = 1, right = Math.max(...primes) * n;

    while (left < right) {
        let mid = Math.floor((left + right) / 2);
        let count = primes.reduce((total, prime) => total + Math.floor(mid / prime), 0);

        if (count < n) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }

    return left;
};