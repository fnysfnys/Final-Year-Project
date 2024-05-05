import pandas as pd

def numberOfArithmeticSlices(nums):
   return pd.Series(nums).diff().eq(pd.Series(nums).diff(axis=0)).sum()
