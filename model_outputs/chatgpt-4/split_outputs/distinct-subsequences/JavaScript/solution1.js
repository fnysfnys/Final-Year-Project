function numDistinct1(s, t) {
    function dfs(i, j) {
        if (j == t.length) return 1;
        if (i == s.length) return 0;
        if (s[i] == t[j]) {
            return dfs(i + 1, j + 1) + dfs(i + 1, j);
        } else {
            return dfs(i + 1, j);
        }
    }
    return dfs(0, 0);
}
