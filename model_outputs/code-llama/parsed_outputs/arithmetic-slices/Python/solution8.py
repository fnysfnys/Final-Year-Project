from sympy import *

class Solution(object):
    def numberOfArithmeticSlices(self, nums):
       return len(list(sympy.diff(nums, sympy.diff(nums, axis=0))))
    
