var findAllConcatenatedWordsInADict = function(words) {
    const set = new Set(words);
    const result = [];
    
    function isConcatenated(word, start) {
        if (start === word.length) return true;
        for (let end = start + 1; end <= word.length; ++end) {
            const prefix = word.substring(start, end);
            if (set.has(prefix) && isConcatenated(word, end)) {
                return true;
            }
        }
        return false;
    }
    
    for (const word of words) {
        set.delete(word);
        if (isConcatenated(word, 0)) {
            result.push(word);
        }
        set.add(word);
    }
    
    return result;
};
