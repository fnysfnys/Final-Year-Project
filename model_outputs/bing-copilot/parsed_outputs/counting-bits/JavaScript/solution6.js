function countBits(n, accumulator = 0) {
    if (n === 0) {
        return accumulator;
    }
    return countBits(n / 2, accumulator + (n & 1));
}
