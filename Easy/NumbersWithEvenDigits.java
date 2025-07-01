class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(evenDigits(nums[i])) {
                ++count;
            }
        }
        return count;
    }
    boolean evenDigits(int x) {
        // Function to check number of digits and return true if even 
        int digits = 0; 
        while(x > 0) {
            ++digits;
            x /= 10;
        }
        if(digits % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
// time complexity beats 98.62% and memory complexity beats 97.92%
