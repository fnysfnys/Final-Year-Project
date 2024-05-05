class Solution:
    def findAllConcatenatedWordsInADict(self, words):
        def can_form(word, word_set, memo):
            if word in memo:
                return memo[word]
            for i in range(1, len(word)):
                prefix, suffix = word[:i], word[i:]
                if prefix in word_set and can_form(suffix, word_set, memo):
                    memo[word] = True
                    return True
            memo[word] = False
            return False

        word_set = set(words)
        memo = {}
        return [word for word in words if can_form(word, word_set, memo)]
