class TrieNode {
    constructor() {
        this.children = new Map();
        this.isEnd = false;
    }
}

var findAllConcatenatedWordsInADict = function(words) {
    const isConcatenated = (word, root, count) => {
        let node = root;
        for (let i = 0; i < word.length; i++) {
            const char = word[i];
            if (!node.children.has(char)) return false;
            node = node.children.get(char);
            if (node.isEnd) {
                if (i === word.length - 1) return count >= 1;
                if (isConcatenated(word.slice(i + 1), root, count + 1)) return true;
            }
        }
        return false;
    };
    
    const root = new TrieNode();
    const result = [];
    
    words.sort((a, b) => a.length - b.length);
    
    for (const word of words) {
        if (isConcatenated(word, root, 0)) {
            result.push(word);
        }
        let node = root;
        for (const char of word) {
            if (!node.children.has(char)) {
                node.children.set(char, new TrieNode());
            }
            node = node.children.get(char);
        }
        node.isEnd = true;
    }
    
    return result;
};