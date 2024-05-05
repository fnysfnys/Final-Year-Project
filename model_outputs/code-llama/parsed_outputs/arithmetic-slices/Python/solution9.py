import matplotlib.pyplot as plt

class Solution(object):
    def numberOfArithmeticSlices(self, nums):
       plt.plot(nums)
       return len(plt.gca().get_lines())
    
