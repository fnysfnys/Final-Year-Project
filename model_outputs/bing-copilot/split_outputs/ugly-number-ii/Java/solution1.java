public int nthUglyNumber(int n) {
    int[] uglyNumbers = new int[n];
    uglyNumbers[0] = 1;
    int nextUglyIndex = 1;

    int nextMultipleOf2 = 2;
    int nextMultipleOf3 = 3;
    int nextMultipleOf5 = 5;

    while (nextUglyIndex < n) {
        int nextUgly = Math.min(nextMultipleOf2, Math.min(nextMultipleOf3, nextMultipleOf5));
        uglyNumbers[nextUglyIndex] = nextUgly;

        if (nextUgly == nextMultipleOf2) {
            nextMultipleOf2 = 2 * uglyNumbers[++nextMultipleOf2];
        }
        if (nextUgly == nextMultipleOf3) {
            nextMultipleOf3 = 3 * uglyNumbers[++nextMultipleOf3];
        }
        if (nextUgly == nextMultipleOf5) {
            nextMultipleOf5 = 5 * uglyNumbers[++nextMultipleOf5];
        }

        nextUglyIndex++;
    }

    return uglyNumbers[n - 1];
}
