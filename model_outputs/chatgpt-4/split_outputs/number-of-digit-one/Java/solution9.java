public int countDigitOne(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
        count += Pattern.compile("1").matcher(Integer.toString(i)).results().count();
    }
    return count;
}
