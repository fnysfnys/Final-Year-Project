var findSubstringInWraproundString = function(s) {
    const hash = {};
    let maxLen = 0;

    for (let i = 0; i < s.length; i++) {
        if (i > 0 && (s.charCodeAt(i) - s.charCodeAt(i - 1) === 1 || s.charCodeAt(i - 1) - s.charCodeAt(i) === 25)) {
            maxLen++;
        } else {
            maxLen = 1;
        }
        hash[s[i]] = Math.max(hash[s[i]] || 0, maxLen);
    }

    return Object.values(hash).reduce((a, b) => a + b, 0);
};
