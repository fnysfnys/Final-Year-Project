class Solution(object):
    def findSubstringInWraproundString(self, s):
        # Docstring...

        from collections import deque
        queue = deque()
        unique_substrings = set()

        for char in s:
            new_queue = deque()
            new_queue.append(char)
            for seq in queue:
                if (ord(seq[-1]) - ord(char)) % 26 == -1:
                    new_queue.append(seq + char)
            queue = new_queue
            unique

_substrings.update(queue)

        return len(unique_substrings)
