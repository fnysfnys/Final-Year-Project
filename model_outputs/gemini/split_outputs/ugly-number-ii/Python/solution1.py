def nthUglyNumber(self, n):
    count = 0
    num = 1
    while count < n:
        if self.isUgly(num):
            count += 1
        num += 1
    return num
