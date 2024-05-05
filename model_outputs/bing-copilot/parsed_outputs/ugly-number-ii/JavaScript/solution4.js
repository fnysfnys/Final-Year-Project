var nthUglyNumber = function(n) {
    if (n === 1) return 1;
    const prev = nthUglyNumber(n - 1);
    let next = prev + 1;
    while (!isUgly(next)) next++;
    return next;
};

function isUgly(num) {
    while (num % 2 === 0) num /= 2;
    while (num % 3 === 0) num /= 3;
    while (num % 5 === 0) num /= 5;
    return num === 1;
}
