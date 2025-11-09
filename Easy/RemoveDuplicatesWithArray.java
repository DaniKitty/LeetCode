class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 1; 
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                ++unique; 
            }
        }
        int[] expectedNums = new int[unique]; 
        expectedNums[0] = nums[0]; 
        int k = 1; 
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) { 
                expectedNums[k++] = nums[i]; 
            }
        }
        System.arraycopy(expectedNums, 0, nums, 0, unique);
        return unique;
    }
} 
