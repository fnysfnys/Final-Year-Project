var integerReplacement = function(n) {
    let count = 0;
    for (; n > 1; count++) {
        if (n % 2 === 0) {
            n /= 2;
        } else if (n % 4 === 1 || n === 3) {
            n--;
        } else {
            n++;
        }
    }
    return count;
};
