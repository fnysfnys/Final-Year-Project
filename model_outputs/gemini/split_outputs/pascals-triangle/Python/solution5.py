def generate(self, numRows):
    for i in range(numRows):
        row = [1] * (i + 1)
        for j in range(1, i):
            row[j] = yield from self.generate(1)
        yield row
