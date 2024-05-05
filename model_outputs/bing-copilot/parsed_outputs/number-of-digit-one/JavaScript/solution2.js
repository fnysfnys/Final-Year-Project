var countDigitOne = function(n) {
    let count = 0;
    for (let num = n; num > 0; num = Math.floor(num / 10)) {
        count += (num % 10 === 1);
    }
    return count;
};
