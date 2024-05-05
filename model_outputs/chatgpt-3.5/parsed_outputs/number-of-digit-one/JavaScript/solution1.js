var countDigitOne = function(n) {
    let count = 0;
    for (let i = 1; i <= n; i++) {
        let num = i;
        while (num > 0) {
            if (num % 10 === 1) {
                count++;
            }
            num = Math.floor(num / 10);
        }
    }
    return count;
};