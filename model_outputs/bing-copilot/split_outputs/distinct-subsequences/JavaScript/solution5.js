var numDistinct = function(s, t) {
    const counts = Array.from({ length: s.length + 1 }, () => Array(t.length + 1).fill(0));
    for (let i = 0; i <= s.length; i++) counts[i][0] = 1;
    for (let i = 1; i <= s.length; i++) {
        for (let j = 1; j <= t.length; j++) {
            counts[i][j] = counts[i - 1][j];
            if (s[i - 1] === t[j - 1]) counts[i][j] += counts[i - 1][j - 1];
        }
    }
    return counts[s.length][t.length];
};
