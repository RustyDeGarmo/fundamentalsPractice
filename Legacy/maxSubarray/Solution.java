class Solution{
    public int maxSubArray(int[] nums) {
        
        
        int sum = Integer.MIN_VALUE;
        int tempSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            //sum the nums array
            tempSum += nums[i];
            
            //if the current subarray sum is greater than our result sum, 
            //update the result sum
            if(tempSum > sum){
                sum = tempSum;
            }
            
            //if the sum reaches zero or negative we're starting a new
            //subarray. As long as the value is positive it will add to
            //the value of our subarray
            if(tempSum < 0){
                tempSum = 0;
            }
        }
        
        return sum;
        
        
    }
}