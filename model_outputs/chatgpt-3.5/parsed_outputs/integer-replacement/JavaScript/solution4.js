var integerReplacement = function(n) {
    let count = 0;
    while (n !== 1) {
        if (n % 2 === 0) {
            n >>>= 1; // Right shift by 1 (equivalent to n /= 2)
        } else {
            if ((n & 2) === 0 || n === 3) {
                n--;
            } else {
                n++;
            }
        }
        count++;
    }
    return count;
};