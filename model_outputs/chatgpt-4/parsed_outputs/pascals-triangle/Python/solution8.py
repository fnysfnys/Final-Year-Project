class Solution:
       def generate(self, numRows):
           def pascal():
               row = [1]
               while True:
                   yield row
                   row = [x + y for x, y in zip([0] + row, row + [0])]
           
           return list(next(pascal()) for _ in range(numRows))