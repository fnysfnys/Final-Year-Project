var integerReplacement = function(n) {
    let count = 0;
    while (n !== 1) {
        if (n === 3) {
            n--;
        } else if (n & 1) {
            if ((n + 1) & 2 || n === 1) {
                n--;
            } else {
                n++;
            }
        } else {
            n >>>= 1;
        }
        count++;
    }
    return count;
};