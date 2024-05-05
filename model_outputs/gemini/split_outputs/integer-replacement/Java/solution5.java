public int integerReplacement(int n) {
    int count = 0;
    while (n > 1) {
        if ((n & 2) == 0 || n == 3) {
            n--;
        } else {
            n >>= 1;
        }
        count++;
    }
    return count;
}
