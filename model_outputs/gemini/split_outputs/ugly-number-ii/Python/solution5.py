def nthUglyNumber(self, n):
    primes = [False] * (1691)
    primes[0] = primes[1] = True
    for i in range(2, int(1691**0.5) + 1):
        if not primes[i]:
            for j in range(i * i, 1691, i):
                primes[j] = True
    ugly_nums = [1]
    i2, i3, i5 = 0, 0, 0
    while len(ugly_nums) < n:
        next2, next3, next5 = ugly_nums[i2] * 2, ugly_nums[i3] * 3, ugly_nums[i5] * 5
        min_val = min(next2, next3, next5)
        if min_val == next2 and not primes[next2 // 2]:
            i2 += 1
        elif min_val == next3 and not primes[next3 // 3]:
            i3 += 1
        else:
            i5 += 1
        ugly_nums.append(min_val)
    return ugly_nums[n - 1]
