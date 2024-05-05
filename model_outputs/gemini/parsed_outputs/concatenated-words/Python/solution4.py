class Solution(object):
    def findAllConcatenatedWordsInADict(self, words):
      word_set = set(words)
    
      def backtrack(word, start, concatenations):
        stack = [(start, concatenations)]
        while stack:
          curr_start, curr_concatenations = stack.pop()
          if curr_start == len(word):
            if len(curr_concatenations) >= 2:
              return True
            continue
          for i in range(curr_start + 1, len(word) + 1):
            prefix = word[curr_start:i]
            if prefix in word_set:
              stack.append((i, curr_concatenations + [prefix]))
        return False
    
      return [word for word in words if backtrack(word, 0, [])]
    
