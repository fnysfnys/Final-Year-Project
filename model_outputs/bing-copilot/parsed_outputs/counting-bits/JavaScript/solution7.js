function countBits(num) {
    return num.toString(2).split('').filter(bit => bit === '1').length;
}
