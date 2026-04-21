class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxFreq = 0;
        while(r<s.length()){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)+1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r))); // it may consider invalid window also but that will always be equal or lesser than global max window thats why we are not updating it with each window shrink
            while((r-l+1) - maxFreq > k){ // replacement  > k => invalid
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));
                l++;
            }
            ans = Math.max(ans, r-l+1);
            r++;
        }
        return ans;
    }
}