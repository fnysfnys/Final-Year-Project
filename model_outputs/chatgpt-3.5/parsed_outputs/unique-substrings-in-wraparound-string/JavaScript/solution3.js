var findSubstringInWraproundString = function(s) {
    const maxLengthMap = new Map();
    let maxLength = 0;
    
    for (let i = 0; i < s.length; i++) {
        if (i > 0 && (s[i - 1] === 'z' && s[i] === 'a' || s[i - 1].charCodeAt(0) + 1 === s[i].charCodeAt(0))) {
            maxLength++;
        } else {
            maxLength = 1;
        }
        const char = s[i];
        maxLengthMap.set(char, Math.max(maxLengthMap.get(char) || 0, maxLength));
    }
    
    return [...maxLengthMap.values()].reduce((sum, val) => sum + val, 0);
};