import seaborn as sns

def numberOfArithmeticSlices(nums):
   return len(sns.lineplot(x=nums).get_lines())
