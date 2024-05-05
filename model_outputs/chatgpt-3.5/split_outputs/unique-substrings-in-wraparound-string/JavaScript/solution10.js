var findSubstringInWraproundString = function(s) {
    const base = 'abcdefghijklmnopqrstuvwxyz';
    const set = new Set();
    for (let i = 0; i < s.length; i++) {
        let j = i;
        while (j < s.length && base.includes(s[j])) {
            set.add(s.substring(i, j + 1));
            j++;
        }
    }
    return set.size;
};
