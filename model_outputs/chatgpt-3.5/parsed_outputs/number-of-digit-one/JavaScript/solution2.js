var countDigitOne = function(n) {
    let count = 0;
    for (let i = 1; i <= n; i++) {
        let str = i.toString();
        count += str.split('1').length - 1;
    }
    return count;
};