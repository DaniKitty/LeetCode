class Solution {
    public int longestSubsequence(String s, int k) {
        int n = s.length();
        int count = 0;
        int zero = 0;
        long pow = 1; 
        long value = 0;
        for(int i = n - 1; i >= 0; i--) {
            if(s.charAt(i) == '1') {
                if(pow > k) {
                    break;
                }
                if(value + pow <= k) {
                    value += pow;
                    ++count;
                }
            }
            pow *= 2;
            if(pow > k) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                zero++;
            }
        }
        return(count + zero);
    }
}
// beats 100% of coders
