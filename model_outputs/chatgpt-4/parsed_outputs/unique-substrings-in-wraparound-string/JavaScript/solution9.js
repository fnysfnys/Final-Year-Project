var findSubstringInWraproundString = function(s) {
    const set = new Set();
    let count = 0;

    for (let i = 0; i < s.length; i++) {
        if (i > 0 && (s.charCodeAt(i) - s.charCodeAt(i - 1) !== 1 && s.charCodeAt(i - 1) - s.charCodeAt(i) !== 25)) {
            count = 0;
        }
        for (let j = i; j < s.length && j - i < 26; j++) {
            if (set.has(s.substring(i, j + 1))) continue;
            set.add(s.substring(i, j + 1));
            count++;
        }
    }

    return count;
};