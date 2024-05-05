var findSubstringInWraproundString = function(s) {
    const base = 'abcdefghijklmnopqrstuvwxyz';
    const set = new Set();
    for (let i = 0; i < s.length; i++) {
        const regex = new RegExp(`^${s[i]}*`, 'g');
        const matches = s.substring(i).match(regex);
        if (matches) {
            matches.forEach(match => set.add(match));
        }
    }
    return set.size;
};
