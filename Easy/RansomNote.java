class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ch = magazine.toCharArray();
        Arrays.sort(ch);
        int l = ransomNote.length();
        int check = 0; 
        for(int i = 0; i < l; i++) {
            for(int j = 0; j < ch.length; j++) {
                if(ransomNote.charAt(i) == ch[j]) {
                    ch[j] = 0;
                    ++check;
                    break;
                }
            }
        }
        if(check == l) {
            return true;
        }
        else {
            return false;
        }
    }
}
