var countDigitOne = function(n) {
    let count = 0;
    for (let i = 1; i <= n; i++) {
        count += (i.toString().match(/1/g) || []).length;
    }
    return count;
};