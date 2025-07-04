class Solution {
    public int minimumDeletions(String word, int k) {
        int[] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++; // to count occurances of letters
        }
        int min = Integer.MAX_VALUE;
        for (int t = 0; t <= word.length(); t++) {
            int del = 0;

            for (int f : count) {
                if (f == 0) continue;

                if (f > t + k) del += f - (t + k);
                else if (f < t) del += f;
            }

            if (del < min) min = del; 
        }


        return min;

    }
}
