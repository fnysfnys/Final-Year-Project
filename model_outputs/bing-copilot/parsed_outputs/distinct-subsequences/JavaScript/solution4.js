var numDistinct = function(s, t) {
    const charCount = Array(26).fill(0);
    for (const char of s) charCount[char.charCodeAt(0) - 97]++;
    let result = 1;
    for (const char of t) {
        const count = charCount[char.charCodeAt(0) - 97];
        if (count === 0) return 0;
        result *= count;
    }
    return result;
};
