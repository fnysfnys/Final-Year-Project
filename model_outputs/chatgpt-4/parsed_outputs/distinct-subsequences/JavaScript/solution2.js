function numDistinct(s, t) {
    const memo = Array.from({ length: s.length }, () => Array(t.length).fill(-1));

    function dfs(i, j) {
        if (j == t.length) return 1;
        if (i == s.length) return 0;
        if (memo[i][j] != -1) return memo[i][j];

        if (s[i] == t[j]) {
            memo[i][j] = dfs(i + 1, j + 1) + dfs(i + 1, j);
        } else {
            memo[i][j] = dfs(i + 1, j);
        }
        return memo[i][j];
    }
    return dfs(0, 0);
}
