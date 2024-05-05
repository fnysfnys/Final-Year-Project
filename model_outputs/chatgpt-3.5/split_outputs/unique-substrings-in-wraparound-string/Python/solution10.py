class TrieNode:
    def __init__(self):
        self.children = {}
        self.is_end_of_word = False

class Solution(object):
    def findSubstringInWraproundString(self, s):
        def insert(root, s):
            node = root
            for char in s:
                if char not in node.children:
                    node.children[char] = TrieNode()
                node = node.children[char]
            node.is_end_of_word = True
        
        def count_substrings(root):
            count = 0
            stack = list(root.children.values())
            while stack:
                node = stack.pop()
                if node.is_end_of_word:
                    count += 1
                stack.extend(node.children.values())
            return count
        
        base = "abcdefghijklmnopqrstuvwxyz"
        root = TrieNode()
        for i in range(len(s)):
            for j in range(i, len(s)):
                if base[j % 26] not in s[i:j+1]:
                    break
                insert(root, s[i:j+1])
        return count_substrings(root)
