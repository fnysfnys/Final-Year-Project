var nthUglyNumber = function(n) {
    let count = 1;
    let num = 1;
    while (count < n) {
        num++;
        if (isUgly(num)) {
            count++;
        }
    }
    return num;
};

function isUgly(num) {
    while (num % 2 === 0) num /= 2;
    while (num % 3 === 0) num /= 3;
    while (num % 5 === 0) num /= 5;
    return num === 1;
}
