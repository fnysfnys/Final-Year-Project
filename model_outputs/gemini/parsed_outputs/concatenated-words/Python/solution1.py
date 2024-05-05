class Solution(object):
    def findAllConcatenatedWordsInADict(self, words):
      word_set = set(words)
    
      def backtrack(word, start, concatenations):
        if start == len(word):
          if len(concatenations) >= 2:
            return True
          return False
        for i in range(start + 1, len(word) + 1):
          prefix = word[:i]
          if prefix in word_set and backtrack(word, i, concatenations + [prefix]):
            return True
        return False
    
      return [word for word in words if backtrack(word, 0, [])]
    
