class Solution {
    public int maxProfit(int[] prices) {
        int maxprof = 0;
        int buy = Integer.MAX_VALUE;

        for(int prix : prices)
        {
            if(buy > prix)
                buy = prix;
            else if(prix - buy > maxprof)
                maxprof = prix-buy;
        }
        return maxprof;
    }
}