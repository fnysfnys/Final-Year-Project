var findSubstringInWraproundString = function(s) {
    const base = 'abcdefghijklmnopqrstuvwxyz';
    const set = new Set();
    for (let i = 0; i < s.length; i++) {
        for (let j = i; j < s.length; j++) {
            if (base.includes(s[j])) {
                set.add(s.substring(i, j + 1));
            } else {
                break;
            }
        }
    }
    return set.size;
};
