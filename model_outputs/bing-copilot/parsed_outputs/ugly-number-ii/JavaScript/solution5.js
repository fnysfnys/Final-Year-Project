var nthUglyNumber = function(n) {
    return Math.pow(2, Math.floor(n / 3)) * Math.pow(3, Math.floor((n - 1) / 3));
};
