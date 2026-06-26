class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int l = 0;
        int maxf = 0;
        int res = 0;
        for(int r=0;r<s.length();r++){
            int f = freq.getOrDefault(s.charAt(r),0)+1;
            freq.put(s.charAt(r), f);
            maxf = Math.max(f,maxf);
            while(r-l+1 - maxf > k){
                freq.put(s.charAt(l), freq.get(s.charAt(l))-1);
                l++;
            }
            res = Math.max(res,r-l+1);
        }
        return res;
    }
}
