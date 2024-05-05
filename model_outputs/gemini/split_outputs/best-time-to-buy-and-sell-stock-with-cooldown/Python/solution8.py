import pandas as pd

def maxProfit(self, prices):
  df = pd.DataFrame({"price": prices})
  df["min_price"] = df["price"].cummin()
  df["profit"] = df["price"] - df["min_price"]
  return df["profit"].max()
