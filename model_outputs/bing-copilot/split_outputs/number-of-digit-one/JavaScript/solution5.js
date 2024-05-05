var countDigitOne = function(n) {
    let count = 0;
    let num = Math.abs(n);
    while (num > 0) {
        num = Math.floor(num / 10);
        count++;
    }
    return count;
};
