class Solution(object):
    def findAllConcatenatedWordsInADict(self, words):
        def is_concatenated(word, word_freq, min_len):
            if word in word_freq and word_freq[word] > 1:
                return True
            for i in range(min_len, len(word)):
                prefix = word[:i]
                suffix = word[i:]
                if prefix in word_freq and is_concatenated(suffix, word_freq, min_len):
                    return True
            return False
        
        word_freq = {}
        min_len = min(map(len, words))
        concatenated_words = []
        
        for word in words:
            word_freq[word] = word_freq.get(word, 0) + 1
        
        for word in words:
            if is_concatenated(word, word_freq, min_len):
                concatenated_words.append(word)
        
        return concatenated_words
