class Solution(object):
    def getRow(self, rowIndex):
        def generate_next_row(prev_row):
            yield 1
            for i in range(1, len(prev_row)):
                yield prev_row[i - 1] + prev_row[i]
            yield 1

        row = [1]
        for _ in range(rowIndex):
            row = list(generate_next_row(row))
        return row
