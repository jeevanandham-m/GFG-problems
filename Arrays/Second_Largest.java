package Arrays;
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        if(n == 1 || n ==0) return -1;
        
        // Arrays.sort(arr);
        int max = -1;
        int second_max = -1;
        
        for(int i = 0 ; i <n ; i++){
            if(arr[i]  >  max){
                second_max = max;
                max = arr[i];
            }
            if(arr[i] < max && arr[i] > second_max) {
                second_max = arr[i];
            }
        }
        
        return second_max;
        
    }
}