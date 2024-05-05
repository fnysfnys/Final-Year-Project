    def countBits10(n):
        ans = []
        for i in range(n + 1):
            binary = str(bin(i)[2:])
            ans.append(binary.count('1'))
        return ans
    