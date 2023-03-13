import java.util.HashMap;

class Solution{
    public int[] twoSum(int[] nums, int target) {
                
        int[] result = new int[2];
        HashMap<Integer, Integer> visitedNums = new HashMap<Integer, Integer>();
        visitedNums.put(nums[0], 0);
        
        for(int i = 1; i < nums.length; i++){
            int differenceValue = target - nums[i];
            
            if(visitedNums.containsKey(differenceValue)){
                        result[0] = visitedNums.get(differenceValue);
                        result[1] = i; 
            }else{
                visitedNums.put(nums[i], i);
            }
        }
        return result;
    }
}