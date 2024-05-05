var findSubstringInWraproundString = function(s) {
    let total = 0;
    let maxLength = 0;
    let i = 0;
    
    while (i < s.length) {
        let j = i + 1

;
        while (j < s.length && (s[j - 1] === 'z' && s[j] === 'a' || s[j - 1].charCodeAt(0) + 1 === s[j].charCodeAt(0))) {
            j++;
        }
        const length = j - i;
        maxLength = length > maxLength ? length : maxLength;
        total += (1 + maxLength) * maxLength / 2;
        i = j;
    }
    
    return total;
};