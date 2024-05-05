var findSubstringInWraproundString = function(s) {
    const memo = {};
    const base = 'abcdefghijklmnopqrstuvwxyz';
    
    function helper(str) {
        if (str.length === 0) return 0;
        if (memo[str]) return memo[str];
        let count = 0;
        for (let i = 0; i < base.length; i++) {
            const substr = base[i];
            if (str.startsWith(substr)) {
                count++;
                count += helper(str.slice(substr.length));
            }
        }
        memo[str] = count;
        return count;
    }
    
    return helper(s);
};
