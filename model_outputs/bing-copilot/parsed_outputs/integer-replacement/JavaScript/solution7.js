var integerReplacement = function(n) {
    let count = 0;
    while (n !== 1) {
        if (n % 2 === 0) {
            n >>= 1;
        } else {
            if (n === 3 || (n & 2) === 0) {
                n--;
            } else {
                n++;
            }
        }
        count++;
    }
    return count;
};
