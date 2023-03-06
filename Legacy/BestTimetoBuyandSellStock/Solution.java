import java.util.HashMap;

class Solution {
    public int maxProfit(int[] prices) {
        
        //Need at least one loop to iterate the array
        //Probably want to use a hashmap to store the price per day
        //so we don't end up with O(n^2) time complexity, sacrificing 
        //some storage for faster execution assuming that is desirable
        //Use the day for the key and the price for the value?
        //Add the first entry to the map because we can't sell on the 
        //first day
        HashMap<Integer, Integer> dayPriceMap = new HashMap<Integer, Integer>();
        dayPriceMap.put(0, prices[0]);
        
        //initialize variables with the first day we could buy and the last
        //day we could sell, profit to zero
        int buyDay = 0;
        int sellDay = prices.length - 1;
        int profit = 0;
        
        //loop starts at second day so we have something to compare to
        for(int i = 1; i < prices.length; i++){
            //add the price to the map
            dayPriceMap.put(i, prices[i]);
            
            //we need to update the buy/sell day if the price is better
            //but only update the sell day if it is later than the
            //buy day and the buy day if it is earlier than the sell day
            if(dayPriceMap.get(i) < prices[buyDay]){
                buyDay = i;
            }
            if(dayPriceMap.get(i) - prices[buyDay] > profit){
                sellDay = i;
            }
            if(buyDay < sellDay){
                profit = prices[sellDay] - prices[buyDay];
            }
        }
        //if there is no profit return 0 otherwise return the difference between
        //the sell day and the buy day
        
        if(profit < 0){
            return 0;
        }else{
            return profit;
        }
    }
}