import matplotlib.pyplot as plt

def numberOfArithmeticSlices(nums):
   plt.plot(nums)
   return len(plt.gca().get_lines())
