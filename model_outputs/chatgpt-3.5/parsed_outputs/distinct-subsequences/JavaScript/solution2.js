var numDistinct = function(s, t) {
    const m = s.length;
    const n = t.length;
    
    const memo = {};
    
    function dfs(i, j) {
        if (j === n) return 1;
        if (i === m) return 0;
        
        const key = i + '-' + j;
        if (memo[key] !== undefined) return memo[key];
        
        let ways = 0;
        if (s[i] === t[j]) {
            ways += dfs(i + 1, j + 1);
        }
        ways += dfs(i + 1, j);
        
        memo[key] = ways;
        return ways;
    }
    
    return dfs(0, 0);
};