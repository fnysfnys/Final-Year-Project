var integerReplacement = function(n) {
    let count = 0;
    while (n !== 1) {
        if (n & 1) {
            if ((n & 2) && n !== 3) n++;
            else n--;
        } else {
            n >>>= 1;
        }
        count++;
    }
    return count;
};
