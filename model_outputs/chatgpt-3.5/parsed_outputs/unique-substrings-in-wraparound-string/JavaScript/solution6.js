var findSubstringInWraproundString = function(s) {
    let maxLength = 0;
    let total = 0;
    
    for (let i = 0; i < s.length; i++) {
        maxLength = i > 0 && (s[i - 1] === 'z' && s[i] === 'a' || s[i - 1].charCodeAt(0) + 1 === s[i].charCodeAt(0)) ? maxLength + 1 : 1;
        total += Math.max(maxLength, s.charCodeAt(i) - 'a'.charCodeAt(0) + 1);
    }
    
    return total;
};