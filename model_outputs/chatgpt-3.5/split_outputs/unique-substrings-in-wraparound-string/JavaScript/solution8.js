var findSubstringInWraproundString = function(s) {
    const base = 'abcdefghijklmnopqrstuvwxyz';
    let count = 0;
    for (let i = 0; i < s.length; i++) {
        let j = i;
        while (j < s.length && base.includes(s[j])) {
            j++;
        }
        count += ((j - i) * (j - i + 1)) / 2;
        i = j - 1;
    }
    return count;
};
