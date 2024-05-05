var integerReplacement = function(n) {
    let count = 0;
    while (n !== 1) {
        n = (n % 2 === 0) ? n / 2 : (n % 4 === 1 || n === 3) ? n - 1 : n + 1;
        count++;
    }
    return count;
};
