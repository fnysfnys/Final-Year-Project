var findSubstringInWraproundString = function(s) {
    const base = 'abcdefghijklmnopqrstuvwxyz';
    const helper = (index, prev) => {
        if (index === s.length) return 0;
        let count = 0;
        const pos = base.indexOf(s[index]);
        if (pos === -1 || (prev !== -1 && (pos !== (prev + 1) % 26))) {
            count += helper(index + 1, -1);
        } else {
            count += 1 + helper(index + 1, pos);
        }
        return count;
    };

    return helper(0, -1);
};
