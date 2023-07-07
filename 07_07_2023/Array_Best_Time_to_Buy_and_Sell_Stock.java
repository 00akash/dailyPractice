public class Array_Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] nums) {
        //Best_Time_to_Buy_and_Sell_Stock

        int n = nums.length;
        int min_day_buy = nums[0];
        int max_profit = 0;

        for(int i = 1; i<n; i++){
            int cost = nums[i]-min_day_buy;
            max_profit = Math.max(cost,max_profit);
            min_day_buy = Math.min(min_day_buy,nums[i]);
            }
         return max_profit;
    }
}
