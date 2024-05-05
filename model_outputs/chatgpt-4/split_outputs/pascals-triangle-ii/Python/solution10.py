class Solution(object):
    def getRow(self, rowIndex):
        """
        [Docstring provided by the user]
        """
        def generate_pascals_triangle():
            row = [1]
            while True:
                yield row
                row = [x + y for x, y in zip([0] + row, row + [0])]

        generator = generate_pascals_triangle()
        for _ in range(rowIndex + 1):
            row = next(generator)
        return row
