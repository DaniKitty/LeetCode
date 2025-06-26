class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int l = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < l; i++) {
            if(nums[i] == key) {
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < l; i++) {
            for(int j = 0; j < list.size(); j++) {
                if(Math.abs(result[j] - i) <= k) {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans; 
    }
}

// beats 79% of coders 
