var canIWin = function(maxChoosableInteger, desiredTotal) {
    if (maxChoosableInteger >= desiredTotal) return true;
    if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) return false;
    
    const visited = new Set();
    
    function dfs(total) {
        if (total >= desiredTotal) return false;
        const key = Array.from(visited).join(',');
        if (visited.has(key)) return false;
        
        for (let i = 1; i <= maxChoosableInteger; i++) {
            if (!visited.has(i)) {
                visited.add(i);
                if (!dfs(total + i)) {
                    visited.delete(i);
                    return true;
                }
                visited.delete(i);
            }
        }
        
        visited.add(key);
        return false;
    }
    
    return dfs(0);
};
