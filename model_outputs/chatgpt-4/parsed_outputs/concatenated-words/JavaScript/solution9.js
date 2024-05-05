class TrieNode {
    constructor() {
        this.children = new Map();
        this.isEnd = false;
    }
}

var findAllConcatenatedWordsInADict = function(words) {
    const root = new TrieNode();
    
    const isConcatenated = (word, root, memo) => {
        if (memo.has(word)) return memo.get(word);
        let node = root;
        for (let i = 0; i < word.length; i++) {
            const char = word[i];
            if (!node.children.has(char)) return false;
            node = node.children.get(char);
            if (node.isEnd) {
                if (i === word.length - 1 || isConcatenated(word.slice(i + 1), root, memo)) {
                    memo.set(word, true);
                    return true;
                }
            }
        }
        memo.set(word, false);
        return false;
    };
    
    for (const word of words) {
        let node = root;
        for (const char of word) {
            if (!node.children.has(char)) {
                node.children.set(char, new TrieNode());
            }
            node = node.children.get(char);
        }
        node.isEnd = true;
    }
    
    const memo = new Map();
    return words.filter(word => {
        return isConcatenated(word, root, memo);
    });
};