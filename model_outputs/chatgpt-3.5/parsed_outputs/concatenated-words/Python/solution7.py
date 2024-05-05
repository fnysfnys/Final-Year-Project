class TrieNode:
    def __init__(self):
        self.children = {}
        self.is_end = False

class Trie:
    def __init__(self):
        self.root = TrieNode()
    
    def insert(self, word):
        node = self.root
        for char in word:
            if char not in node.children:
                node.children[char] = TrieNode()
            node = node.children[char]
        node.is_end = True
    
    def search(self, word):
        node = self.root
        for char in word:
            if char not in node.children:
                return False
            node = node.children[char]
        return node.is_end

class Solution(object):
    def findAllConcatenatedWordsInADict(self, words):
        def can_concatenate(word):
            if word in word_set:
                return True
            for i in range(1, len(word)):
                prefix = word[:i]
                suffix = word[i:]
                if trie.search(prefix) and can_concatenate(suffix):
                    return True
            return False
        
        word_set = set(words)
        concatenated_words = []
        trie = Trie()
        
        for word in words:
            if word != "":
                trie.insert(word)
        
        for word in words:
            word_set.remove(word)
            if can_concatenate(word):
                concatenated_words.append(word)
            word_set.add(word)
        
        return concatenated_words