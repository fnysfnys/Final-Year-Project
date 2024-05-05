import pandas as pd

class Solution(object):
    def numberOfArithmeticSlices(self, nums):
       return pd.Series(nums).diff().eq(pd.Series(nums).diff(axis=0)).sum()
    
