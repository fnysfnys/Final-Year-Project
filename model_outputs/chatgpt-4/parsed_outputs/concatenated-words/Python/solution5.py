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
        
        shorter_words = set(words)
        concatenated_words = []
        
        for word in words:
            shorter_words.remove(word)
            if is_concatenated(word, shorter_words):
                concatenated_words.append(word)
            shorter_words.add(word)
        
        return concatenated_words