var findSubstringInWraproundString = function(s) {
    const set = new Set();
    const base = 'abcdefghijklmnopqrstuvwxyz';

    for (let i = 0; i < s.length; i++) {
        for (let j = i; j < s.length; j++) {
            const substr = s.substring(i, j + 1);
            if (base.includes(substr)) {
                set.add(substr);
            }
        }
    }

    return set.size;
};
