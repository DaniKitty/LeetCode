class Solution {
    public int[] replaceElements(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > temp) {
                    temp = arr[j];
                }
            }
            arr[i] = temp; 
            temp = 0;
        }
        arr[arr.length - 1] = -1; 
        return arr;
    }
} 
