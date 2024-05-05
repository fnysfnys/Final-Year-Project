var getMaxRepetitions = function(s1, n1, s2, n2) {
    const countChars = (str) => {
        const count = {};
        for (let char of str) {
            count[char] = (count[char] || 0) + 1;
        }
        return count;
    };

    const counts1 = countChars(s1);
    const counts2 = countChars(s2);

    let minRatio = Infinity;
    for (let char in counts2) {
        if (!counts1[char]) return 0;
        minRatio = Math.min(minRatio, Math.floor(counts1[char] * n1 / (counts2[char] * n2)));
    }

    return minRatio;
};
