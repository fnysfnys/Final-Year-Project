class Solution(object):
    def numDistinct(self, s, t):
        def get_hash(string):
            p = 31
            mod = 10**9 + 7
            hash_value = 0
            for char in string:
                hash_value = (hash_value * p + ord(char)) % mod
            return hash_value
    
        hash_t = get_hash(t)
        n, m = len(s), len(t)
        suffix_array = sorted(range(n), key=lambda i: s[i:])
        count = 0
        power = 1
        for i in range(1, m + 1):
            power *= p
        p_pow = 1
        for i in suffix_array:
            if i + m > n:
                break
            current_hash = (get_hash(s[i:i + m]) - p_pow * s[i]) % mod
            if current_hash == hash_t:
                count += 1
            p_pow = (p_pow * ord(s[i])) % mod
        return count
    
