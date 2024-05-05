class Solution(object):
    def findAllConcatenatedWordsInADict(self, words):
      word_set = set(words)
      memo = {}
    
      def can_form(word):
        if word in memo:
          return memo[word]
        for i in range(1, len(word)):
          if word[i:] in word_set and can_form(word[:i]):
            memo[word] = True
            return True
        memo[word] = False
        return False
    
      return [word for word in words if can_form(word)]
    
