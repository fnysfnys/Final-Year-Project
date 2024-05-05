class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int count = 0;
        List<int[]> sol = new ArrayList<>();

        int i = 0;
        while (i < n - 1) {
            while (i < n - 1 && prices[i + 1] <= prices[i])
                i++;

            if (i == n - 1)
                break;

            int[] e = new int[2];
            e[0] = i++;
            while (i < n && prices[i] >= prices[i - 1])
                i++;
            e[1] = i - 1;
            sol.add(e);
            count++;
        }

        if (count == 0)
            System.out.println("There is no day when buying the stock will make profit");
        else {
            for (int j = 0; j < count; j++) {
                System.out.println("Buy on day: " + sol.get(j)[0] + " Sell on day: " + sol.get(j)[1]);
            }
        }
        return count;
    }
}
