var findSubstringInWraproundString = function(s) {
    const map = new Map();
    let k = 0;

    for (let i = 0; i < s.length; i++) {
        if (i > 0 && (s.charCodeAt(i) - s.charCodeAt(i - 1) !== 1 && s.charCodeAt(i) - s.charCodeAt(i - 1) !== -25)) {
            k = 0;
        }
        map.set(s[i], Math.max(map.get(s[i]) || 0, ++k));
    }

    return Array.from(map.values()).reduce((a, b) => a + b, 0);
};
