   def countBits9(n):
       lookup = [bin(i).count('1') for i in range(256)]
       ans = []
       for i in range(n + 1):
           ans.append(lookup[i & 0xff] + lookup[(i >> 8) & 0xff] +
                      lookup[(i >> 16) & 0xff] + lookup[i >> 24])
       return ans
   