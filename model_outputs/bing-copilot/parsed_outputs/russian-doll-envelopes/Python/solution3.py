class Solution(object):
    def maxEnvelopes(self, envelopes):
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        stack = []
        for _, h in envelopes:
            if not stack or h > stack[-1]:
                stack.append(h)
            else:
                idx = bisect_left(stack, h)
                stack[idx] = h
        return len(stack)
