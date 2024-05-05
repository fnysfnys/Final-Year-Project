function countBits(num) {
    const idx = Math.floor(Math.log2(num));
    let bit = 1;
    let count = 0;
    while (bit) {
        bit = (num & (1 << idx)) >> idx;
        count += bit;
        idx -= 1;
    }
    return count;
}
