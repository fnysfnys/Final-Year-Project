var integerReplacement = function(n) {
    let count = 0;
    while (n > 1) {
        if (n % 2 === 0) {
            n /= 2;
        } else {
            let plusOne = integerReplacement(n + 1);
            let minusOne = integerReplacement(n - 1);
            count += 1 + Math.min(plusOne, minusOne);
            break; // Break after calculating either n+1 or n-1 path
        }
        count++;
    }
    return count;
};
