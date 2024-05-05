class Solution(object):
    def maxEnvelopes(self, envelopes):
        envelopes.sort(key=lambda x: (x[0], -x[1]))
        stack = []
        for envelope in envelopes:
            index = bisect.bisect_left(stack, envelope[1])
            if index == len(stack):
                stack.append(envelope[1])
            else:
                stack[index] = envelope[1]
        return len(stack)
