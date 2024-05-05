var countDigitOne = function(n) {
    return String(n).split('').reduce((count, digit) => count + (digit === '1'), 0);
};
