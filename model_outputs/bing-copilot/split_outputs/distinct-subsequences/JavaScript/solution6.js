var numDistinct = function(s, t) {
    const counts = Array(t.length + 1).fill(0);
    counts[0] = 1;
    for (let i = 1; i <= s.length; i++) {
        for (let j = t.length; j >= 1; j--) {
            if (s[i - 1] === t[j - 1]) counts[j] += counts[j - 1];
        }
    }
    return counts[t.length];
};
