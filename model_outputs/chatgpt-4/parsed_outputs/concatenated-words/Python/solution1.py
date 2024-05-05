class Solution(object):
    def findAllConcatenatedWordsInADict(self, words):
        def is_concatenated(word, word_set):
            if word in word_set:
                return True
            for i in range(1, len(word)):
                prefix = word[:i]
                suffix = word[i:]
                if prefix in word_set and is_concatenated(suffix, word_set):
                    return True
            return False
        
        word_set = set(words)
        concatenated_words = []
        
        for word in words:
            word_set.remove(word)
            if is_concatenated(word, word_set):
                concatenated_words.append(word)
            word_set.add(word)
        
        return concatenated_words