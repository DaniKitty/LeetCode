class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) {
            return false;
        }
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[temp]) {
                temp = i;
            }
        }
        if((temp == 0)||(temp == arr.length - 1)) {
            return false; 
        }
            for (int i = 0; i < temp; i++) {
                if (arr[i] >= arr[i + 1]) {
                    return false;
                } 
            }
             for (int i = temp; i < arr.length - 1; i++) {
                if (arr[i] <= arr[i + 1]) {
                    return false;
                }
            }
                return true;
        }
        
    }
// memory and time beats 73% and 70% respectively
// only 33% of submissions overall was accepted globaly 
