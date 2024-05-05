from sympy import *

def numberOfArithmeticSlices(nums):
   return len(list(sympy.diff(nums, sympy.diff(nums, axis=0))))
