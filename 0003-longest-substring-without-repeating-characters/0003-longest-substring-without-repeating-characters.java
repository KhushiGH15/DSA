class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> set= new HashSet<>();
       int left =0;
       int maxlen =0 ;
       for(int right=0;right<s.length();right ++) {
        char current = s.charAt(right);
        while(set.contains(current)){
            set.remove(s.charAt(left));
            left++;
        }
        int len = right-left +1;
        maxlen = Math.max(maxlen , len);
        set.add(current);
       }
       return maxlen;
    }
}