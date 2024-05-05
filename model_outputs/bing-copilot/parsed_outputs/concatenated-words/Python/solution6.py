class Solution:
    def findAllConcatenatedWordsInADict(self, words):
        def can_form(word, word_set):
            queue = [word]
            visited = set()
            while queue:
                curr = queue.pop(0)
                if curr in word_set:
                    return True
                for i in range(1, len(curr)):
                    prefix, suffix = curr[:i], curr[i:]
                    if prefix in word_set and suffix not in visited:
                        queue.append(suffix)
                        visited.add(suffix)
            return False

        word_set = set(words)
        return [word for word in words if can_form(word, word_set)]
