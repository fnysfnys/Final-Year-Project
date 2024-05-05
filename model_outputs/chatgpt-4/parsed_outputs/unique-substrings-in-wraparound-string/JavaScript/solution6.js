var findSubstringInWraproundString = function(s) {
    const set = new Set();
    let k = 0;

    for (let i = 0; i < s.length; i++) {
        k = (i > 0 && (s.charCodeAt(i) - s.charCodeAt(i - 1) === 1 || s.charCodeAt(i - 1) - s.charCodeAt(i) === 25)) ? k + 1 : 1;
        for (let j = 0; j < k; j++) {
            set.add(s.substring(i - j, i + 1));
        }
    }

    return set.size;
};