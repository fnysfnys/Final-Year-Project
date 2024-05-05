class Solution(object):
    def findAllConcatenatedWordsInADict(self, words):
        def is_concatenated(word, word_set, memo):
            if word in memo:
                return memo[word]
            
            for i in range(1, len(word)):
                prefix = word[:i]
                suffix = word[i:]
                if prefix in word_set and is_concatenated(suffix, word_set, memo):
                    memo[word] = True
                    return True
            
            memo[word] = False
            return False
        
        word_set = set(words)
        concatenated_words = []
        memo = {}
        
        for word in words:
            word_set.remove(word)
            if is_concatenated(word, word_set, memo):
                concatenated_words.append(word)
            word_set.add(word)
        
        return concatenated_words