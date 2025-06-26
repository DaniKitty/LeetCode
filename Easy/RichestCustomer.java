class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] ans = new int[accounts.length];
        for(int i = 0; i < accounts.length; i++) {
            for(int j = 0; j < accounts[i].length; j++) {
                ans[i] = ans[i] + accounts[i][j];
            }
        }
        Arrays.sort(ans);
        return(ans[ans.length - 1]);
    }
}
