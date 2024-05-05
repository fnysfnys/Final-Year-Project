public List<Integer> getRow(int rowIndex) {
    List<Integer> row = new ArrayList<>();
    int[] dp = new int[rowIndex + 1];
    dp[0] = 1;
    for (int i = 1; i <= rowIndex; i++) {
        for (int j = i; j >= 1; j--) {
            dp[j] += dp[j - 1];
        }
    }
    for (int value : dp) {
        row.add(value);
    }
    return row;
}
