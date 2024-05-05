var numDistinct = function(s, t) {
    const memo = new Map();
    
    function dfs(i, j) {
        if (j === t.length) return 1;
        if (i === s.length) return 0;
        
        const key = i + '-' + j;
        if (memo.has(key)) return memo.get(key);
        
        let ways = 0;
        if (s[i] === t[j]) {
            ways += dfs(i + 1, j + 1);
        }
        ways += dfs(i + 1, j);
        
        memo.set(key, ways);
        return ways;
    }
    
    return dfs(0, 0);
};