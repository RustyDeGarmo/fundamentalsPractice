class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubString = 0;
        String subString = "";
        String resultSubString = "";
        for(int i = 0; i < s.length(); i++){
            if(i == 0){
                subString += s.charAt(i);
            }
            else if(!subString.toLowerCase().contains("" + s.charAt(i))){
                subString += s.charAt(i);
            }
            
            if(subString.length() > resultSubString.length()){
                resultSubString = subString;
                subString = "";
                longestSubString = resultSubString.length();
            }
        }
        return longestSubString;
    }
}