class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> freq = new HashSet<>();
        int maxLength = 0;

        int l = 0;
        for(int r = 0; r< s.length();r++){
            char c = s.charAt(r);
            while(freq.contains(c)){
                freq.remove(s.charAt(l));
                l++;
            }
            freq.add(c);
            maxLength = Math.max(r-l+1,maxLength);
        }
        return maxLength;
    }
}
