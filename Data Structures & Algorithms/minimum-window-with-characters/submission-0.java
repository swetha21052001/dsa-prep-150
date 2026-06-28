class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";
        Map<Character,Integer> freq = new HashMap<>();
        int start = -1;
        int minLen = Integer.MAX_VALUE;
        for(char c: t.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        int l = 0;
        int count = 0;
        for(int r=0;r<s.length();r++){
            char c = s.charAt(r);
            freq.put(c,freq.getOrDefault(c,0)-1);
            if(freq.get(c)>=0) count+=1;
            while(count == t.length()){
                if(r-l+1<minLen){
                    start = l;
                    minLen = r-l+1;
                }
                freq.put(s.charAt(l),freq.getOrDefault(s.charAt(l),0)+1);
                if(freq.get(s.charAt(l))>0) count-=1;
                l++;
            }
        }
        return minLen != Integer.MAX_VALUE? s.substring(start,start+minLen): "";

    }
}
