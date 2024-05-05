var findAllConcatenatedWordsInADict = function(words) {
    const wordSet = new Set(words);
    
    const canFormWord = (word, wordSet) => {
        if (wordSet.has(word)) return true;
        
        for (let i = 1; i < word.length; i++) {
            const prefix = word.substring(0, i);
            const suffix = word.substring(i);
            if (wordSet.has(prefix) && canFormWord(suffix, wordSet)) {
                return true;
            }
        }
        
        return false;
    };
    
    return words.filter(word => {
        wordSet.delete(word);
        return canFormWord(word, wordSet);
    });
};
