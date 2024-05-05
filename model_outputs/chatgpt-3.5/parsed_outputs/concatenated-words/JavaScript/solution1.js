var findAllConcatenatedWordsInADict = function(words) {
    const isConcatenated = (word, dict) => {
        if (dict.has(word)) return true;
        for (let i = 1; i < word.length; i++) {
            const prefix = word.slice(0, i);
            if (dict.has(prefix) && isConcatenated(word.slice(i), dict)) {
                return true;
            }
        }
        return false;
    };
    
    const dict = new Set(words);
    return words.filter(word => {
        dict.delete(word);
        return isConcatenated(word, dict);
    });
};