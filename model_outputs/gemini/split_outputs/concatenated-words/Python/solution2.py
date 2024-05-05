class TrieNode:
  def __init__(self):
    self.children = {}
    self.is_word = False

class Trie:
  def __init__(self):
    self.root = TrieNode()

  def insert(self, word):
    node = self.root
    for char in word:
      if char not in node.children:
        node.children[char] = TrieNode()
      node = node.children[char]
    node.is_word = True

  def search(self, word):
    node = self.root
    for char in word:
      if char not in node.children:
        return False
      node = node.children[char]
    return node.is_word

def findAllConcatenatedWordsInADict(words):
  trie = Trie()
  for word in words:
    trie.insert(word)

  return [word for word in words if check_concatenated(word, trie.root)]

def check_concatenated(word, node):
  if not node:
    return False
  if node.is_word and len(word) > 1:
    return True
  for char, child in node.children.items():
    if check_concatenated(word[1:], child):
      return True
  return False
