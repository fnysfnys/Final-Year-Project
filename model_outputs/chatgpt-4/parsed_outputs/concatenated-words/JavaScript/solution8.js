var findAllConcatenatedWordsInADict = function(words) {
    words.sort((a, b) => a.length - b.length);
    const wordSet = new Set(words);
    
    const canFormWord = (word, dp) => {
        if (dp.has(word)) return dp.get(word);
        for (let i = 1; i < word.length; i++) {
            const prefix = word.substring(0, i);
            const suffix = word.substring(i);
            if (wordSet.has(prefix) && (wordSet.has(suffix) || canFormWord(suffix, dp))) {
                dp.set(word, true);
                return true;
            }
        }
        dp.set(word, false);
        return false;
    };
    
    const dp = new Map();
    return words

.filter(word => {
        wordSet.delete(word);
        return canFormWord(word, dp);
    });
};