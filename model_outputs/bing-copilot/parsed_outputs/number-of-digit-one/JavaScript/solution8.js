var countDigitOne = function(n) {
    let count = 0;
    let position = 1;
    while (position <= n) {
        const divider = position * 10;
        count += Math.floor(n / divider) * position + Math.min(Math.max(n % divider - position + 1, 0), position);
        position *= 10;
    }
    return count;
};
