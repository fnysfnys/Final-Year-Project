var findAllConcatenatedWordsInADict = function(words) {
    const set = new Set(words);
    const memo = new Map();
    
    function canForm(word, start) {
        if (start === word.length) return true;
        if (memo.has(start)) return memo.get(start);
        
        for (let end = start + 1; end <= word.length; ++end) {
            const prefix = word.substring(start, end);
            if (set.has(prefix) && canForm(word, end)) {
                memo.set(start, true);
                return true;
            }
        }
        
        memo.set(start, false);
        return false;
    }
    
    const result = [];
    for (const word of words) {
        set.delete(word);
        if (canForm(word, 0)) {
            result.push(word);
        }
        set.add(word);
    }
    
    return result;
};
