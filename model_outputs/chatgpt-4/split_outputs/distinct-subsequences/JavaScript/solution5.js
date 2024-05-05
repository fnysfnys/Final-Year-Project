function numDistinct5(s, t) {
    const memo = new Map();

    function dfs(i, j) {
        if (j == t.length) return 1;
        if (i == s.length) return 0;
        const key = `${i}-${j}`;
        if (memo.has(key)) return memo.get(key);

        let res = dfs(i + 1, j);
        if (s[i] == t[j]) {
            res += dfs(i + 1, j + 1);
        }
        memo.set(key, res);
        return res;
    }
    return dfs(0, 0);
}
