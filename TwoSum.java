class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] ans = new int[2];
        for(int i = 0; i < len; i++) {
            for(int j = 1; j < len; j++) {
                if(i != j) {
                    if(nums[i] + nums[j] == target) {
                        ans[0] = i;
                        ans[1] = j;
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}
