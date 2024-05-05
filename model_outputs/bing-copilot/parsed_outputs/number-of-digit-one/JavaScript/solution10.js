var countDigitOne = function(n) {
    const table = [0, 1, 20, 300, 4000, 50000, 600000, 7000000, 80000000, 900000000];
    let count = 0;
    let position = 1;
    while (position <= n) {
        const divider = position * 10;
        count += Math.floor(n / divider) * table[position] + Math.min(Math.max(n % divider - position + 1, 0), position);
        position *= 10;
    }
    return count;
};
