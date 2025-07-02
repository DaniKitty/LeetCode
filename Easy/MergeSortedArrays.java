class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = nums2.length - 1; 
        for(int i = nums1.length - 1; i >= 0; i--) {
            if(l >= 0) {
                nums1[i] = nums2[l];
                --l;
            }
        }
        Arrays.sort(nums1);
    }
}
