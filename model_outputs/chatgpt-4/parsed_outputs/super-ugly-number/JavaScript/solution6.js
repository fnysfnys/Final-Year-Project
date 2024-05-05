var nthSuperUglyNumber = function(n, primes) {
    let uglyNumbers = [1];

    for (let i = 1; i < n; i++) {
        let candidates = primes.map(prime => prime * uglyNumbers[uglyNumbers.length - 1]);
        uglyNumbers.push(Math.min(...candidates));
        uglyNumbers = Array.from(new Set(uglyNumbers)).sort((a, b) => a - b);


    }

    return uglyNumbers[n - 1];
};