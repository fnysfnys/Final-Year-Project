from collections import defaultdict

class Solution(object):
    def findAllConcatenatedWordsInADict(self, words):
        def is_concatenated(word, shorter_words):
            if word in shorter_words:
                return True
            for i in range(1, len(word)):
                prefix = word[:i]
                suffix = word[i:]
                if prefix in shorter_words and is_concatenated(suffix, shorter_words):
                    return True
            return False
        
        shorter_words = defaultdict(list)
        concatenated_words = []
        
        for word in words:
            for i in range(1, len(word)):
                prefix = word[:i]
                suffix = word[i:]
                shorter_words[suffix].append(prefix)
        
        for word in words:
            if is_concatenated(word, shorter_words):
                concatenated_words.append(word)
        
        return concatenated_words
