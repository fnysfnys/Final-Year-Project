import numpy as np
def generate(self, numRows):
    triangle = np.zeros((numRows, numRows), dtype=int)
    triangle[:, 0] = 1
    triangle[:, -1] = 1
    for i in range(2, numRows):
        triangle[i, 1:-1] = triangle[i - 1, :-2] + triangle[i - 1, 1:-1]
    return triangle.tolist()
