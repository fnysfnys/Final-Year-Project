class Solution(object):
    def findAllConcatenatedWordsInADict(self, words):
       concatenated_words = set()
       for word in words:
           if word in concatenated_words:
               continue
           for i in range(len(word)):
               if word[:i] in concatenated_words and word[i:] in concatenated_words:
                   concatenated_words.add(word)
                   break
       return list(concatenated_words)
    
