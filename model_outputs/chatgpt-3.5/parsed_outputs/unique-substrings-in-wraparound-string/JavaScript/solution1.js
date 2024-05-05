var findSubstringInWraproundString = function(s) {
    const base = 'abcdefghijklmnopqrstuvwxyz';
    const substrSet = new Set();
    let maxLength = 0;
    
    for (let i = 0; i < s.length; i++) {
        if (i > 0 && (s[i - 1] === 'z' && s[i] === 'a' || s[i - 1].charCodeAt(0) + 1 === s[i].charCodeAt(0))) {
            maxLength++;
        } else {
            maxLength = 1;
        }
        substrSet.add(s[i]);
        substrSet.add(s.substring(i - maxLength + 1, i + 1));
    }
    
    return substrSet.size;
};