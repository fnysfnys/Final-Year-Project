@lru_cache(maxsize=None)
def generate_row(i):
    return [1] * (i + 1) if i == 0 else [1] + [generate_row(i - 1)[j - 1] + generate_row(i - 1)[j] for j in range(1, i)] + [1]

def generate(self, numRows):
    return [generate_row(i) for i in range(numRows)]
