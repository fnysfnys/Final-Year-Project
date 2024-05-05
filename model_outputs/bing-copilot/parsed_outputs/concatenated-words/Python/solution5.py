class Solution:
    def findAllConcatenatedWordsInADict(self, words):
        def can_form(word, word_set):
            if word in word_set:
                return True
            for i in range(1, len(word)):
                prefix, suffix = word[:i], word[i:]
                if prefix in word_set and can_form(suffix, word_set):
                    return True
            return False

        word_set = set(words)
        words.sort(key=len, reverse=True)
        return [word for word in words if can_form(word, word_set)]
