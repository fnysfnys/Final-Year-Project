class Solution(object):
    def integerReplacement(self, n):
        stack = [(n, 0)]
        visited = set()
        while stack:
            num, count = stack.pop()
            if num == 1:
                return count
            if num not in visited:
                visited.add(num)
                if num % 2 == 0:
                    stack.append((num // 2, count + 1))
                else:
                    stack.append((num + 1, count + 1))
                    stack.append((num - 1, count + 1))
        return -1
