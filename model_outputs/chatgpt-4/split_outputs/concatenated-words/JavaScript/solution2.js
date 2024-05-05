var findAllConcatenatedWordsInADict = function(words) {
    const isConcatenated = (word, dict, memo) => {
        if (memo.has(word)) return memo.get(word);
        for (let i = 1; i < word.length; i++) {
            const prefix = word.slice(0, i);
            if (dict.has(prefix) && isConcatenated(word.slice(i), dict, memo)) {
                memo.set(word, true);
                return true;
            }
        }
        memo.set(word, false);
        return false;
    };
    
    const dict = new Set(words);
    const memo = new Map();
    return words.filter(word => {
        dict.delete(word);
        return isConcatenated(word, dict, memo);
    });
};
