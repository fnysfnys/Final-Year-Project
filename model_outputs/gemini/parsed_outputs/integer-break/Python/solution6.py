class Solution(object):
    def integerBreak(self, n):
      products = []
      while n > 1:
        if n % 3 == 0:
          products.append(3)
          n -= 3
        elif n % 2 == 0:
          products.append(2)
          n -= 2
        else:
          products.append(1)
          n -= 1
      return reduce(lambda x, y: x * y, products)
    
