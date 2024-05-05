public int countDigitOneBruteForce(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
        String numStr = String.valueOf(i);
        count += countOnesInString(numStr);
    }
    return count;
}

private int countOnesInString(String str) {
    int count = 0;
    for (char c : str.toCharArray()) {
        if (c == '1') {
            count++;
        }
    }
    return count;
}
