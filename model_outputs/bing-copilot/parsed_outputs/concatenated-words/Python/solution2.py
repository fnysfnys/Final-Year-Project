class TrieNode:
    def __init__(self):
        self.children = {}
        self.is_end = False

class Solution:
    def findAllConcatenatedWordsInADict(self, words):
        def build_trie():
            root = TrieNode()
            for word in words:
                node = root
                for char in word:
                    if char not in node.children:
                        node.children[char] = TrieNode()
                    node = node.children[char]
                node.is_end = True
            return root

        def dfs(node, word, count):
            if node.is_end:
                if count > 1:
                    result.append(word)
            for char, child in node.children.items():
                dfs(child, word + char, count + 1)

        trie = build_trie()
        result = []
        for word in words:
            dfs(trie, word, 0)
        return result
