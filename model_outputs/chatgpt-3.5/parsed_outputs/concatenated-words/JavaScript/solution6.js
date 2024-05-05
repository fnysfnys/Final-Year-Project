var findAllConcatenatedWordsInADict = function(words) {
    const wordSet = new Set(words);
    const queue = [];
    
    const canFormWord = (word) => {
        const visited = new Set();
        const queue = [word];
        
        while (queue.length) {
            const currentWord = queue.shift();
            for (let i = 1; i < currentWord.length; i++) {
                const prefix = currentWord.substring(0, i);
                const suffix = currentWord.substring(i);
                if (wordSet.has(prefix) && wordSet.has(suffix)) {
                    return true;
                }
                if (wordSet.has(prefix) && !visited.has(suffix)) {
                    queue.push(suffix);
                    visited.add(suffix);
                }
            }
        }
        
        return false;
    };
    
    return words.filter(word => {
        wordSet.delete(word);
        return canFormWord(word);
    });
};