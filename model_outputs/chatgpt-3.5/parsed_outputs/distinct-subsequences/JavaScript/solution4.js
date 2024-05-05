var numDistinct = function(s, t) {
    function dfs(i, j) {
        if (j === t.length) return 1;
        if (i === s.length) return 0;
        
        let ways = 0;
        if (s[i] === t[j]) {
            ways += dfs(i + 1, j + 1);
        }
        ways += dfs(i + 1, j);
        
        return ways;
    }
    
    return dfs(0, 0);
};