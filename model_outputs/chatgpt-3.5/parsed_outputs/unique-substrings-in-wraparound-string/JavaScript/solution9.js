var findSubstringInWraproundString = function(s) {
    let total = 0;
    let i = 0;
    
    while (i < s.length) {
        let j = i + 1;
        while (j < s.length && (s[j - 1] === 'z' && s[j] === 'a' || s[j - 1].charCodeAt(0) + 1 === s[j].charCodeAt(0))) {
            j++;
        }
        total += (j - i) * (j - i + 1) / 2;
        i = j;
    }
    
    return total;
};