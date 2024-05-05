var nthUglyNumber = function(n) {
    let num = 1;
    while (n > 0) {
        if (isUgly(num)) n--;
        num++;
    }
    return num - 1;
};

function isUgly(num) {
    while (num % 2 === 0) num /= 2;
    while (num % 3 === 0) num /= 3;
    while (num % 5 === 0) num /= 5;
    return num === 1;
}
