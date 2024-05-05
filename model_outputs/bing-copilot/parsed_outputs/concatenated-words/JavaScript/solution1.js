var findAllConcatenatedWordsInADict = function(words) {
    const arr = [];
    
    class Trie {
        constructor() {
            this.root = new TrieNode();
        }
        
        create(w) {
            let node = this.root;
            for (let i = 0; i < w.length; ++i) {
                const c = w[i];
                node.next[c] = node.next[c] || new TrieNode();
                node = node.next[c];
            }
            node.end = true;
            node.word = w;
        }
        
        find(w, ind, depth) {
            let node = this.root;
            for (let i = ind; i < w.length; ++i) {
                const c = w[i];
                if (node.next[c] === undefined) {
                    return false;
                } else {
                    node = node.next[c];
                }
                
                if (node.end === true) {
                    if (i === w.length - 1) {
                        if (depth >= 1) {
                            arr.push(w);
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if (this.find(w, i + 1, depth + 1)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
    
    class TrieNode {
        constructor() {
            this.next = {};
            this.end = false;
            this.word = '';
        }
    }
    
    const trie = new Trie();
    for (let i = 0; i < words.length; ++i) {
        const w = words[i];
        trie.create(w);
    }
    
    for (let i = 0; i < words.length; ++i) {
        const w = words[i];
        trie.find(w, 0, 0);
    }
    
    return arr;
};
