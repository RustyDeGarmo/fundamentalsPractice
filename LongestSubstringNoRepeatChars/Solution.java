class Solution {
    public int lengthOfLongestSubstring(String s) {
        //check if input is valid
        if(s == null || s.length() == 0) return 0;
        if(s.length() == 1) return 1;

        //variables to track our max substring, pointer, and substring
        //the first pointer will be the loop variable
        int longestSubString = 0;
        int jPointer = 0;
        Set<Character> subString = new HashSet<Character>();

        for(int i = 0; i < s.length(); i++){
            
            //if the character is already in the set, remove the character 
            //and advance second pointer
            //otherwise add the character to the set
            while(subString.contains(s.charAt(i))){
                subString.remove(s.charAt(jPointer));
                jPointer++;
            }
            
            subString.add(s.charAt(i));
            

            //update longestSubString if neccessary
            longestSubString = Math.max(longestSubString, subString.size());
        }

        return longestSubString;
    }
}