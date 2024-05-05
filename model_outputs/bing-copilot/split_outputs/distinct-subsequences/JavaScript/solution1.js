var numDistinct = function(s, t) {
    const memo = new Map();
    const helper = (i, j) => {
        if (j === t.length) return 1;
        if (i === s.length) return 0;
        const key = `${i}-${j}`;
        if (memo.has(key)) return memo.get(key);
        let count = 0;
        if (s[i] === t[j]) count += helper(i + 1, j + 1);
        count += helper(i + 1, j);
        memo.set(key, count);
        return count;
    };
    return helper(0, 0);
};
