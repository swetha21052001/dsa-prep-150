class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder ans = new StringBuilder();
        for(String s: strs){
            ans.append(s.length());
            ans.append("#");
            ans.append(s);

        }
        return ans.toString();

    }
    public List<String> decode(String str){
        List<String> ans = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int delimiter = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, delimiter));
            ans.add(str.substring(delimiter + 1, delimiter + 1 + length));
            i = delimiter + 1 + length;
        }
        return ans;
    }
}
