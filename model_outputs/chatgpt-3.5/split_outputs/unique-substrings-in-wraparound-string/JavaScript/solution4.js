var findSubstringInWraproundString = function(s) {
    const base = 'abcdefghijklmnopqrstuvwxyz';
    const map = new Map();
    let count = 0;
    for (let i = 0; i < s.length; i++) {
        if (i > 0 && (s.charCodeAt(i) - s.charCodeAt(i - 1) === 1 || s.charCodeAt(i - 1) - s.charCodeAt(i) === 25)) {
            count++;
        } else {
            count = 1;
        }
        const index = s.charCodeAt(i) - 97;
        map.set(index, Math.max(map.get(index) || 0, count));
    }
    return [...map.values()].reduce((sum, val) => sum + val, 0);
};
