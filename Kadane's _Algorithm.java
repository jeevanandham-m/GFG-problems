class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int n = arr.length;
        int sum = arr[0];
        int result = arr[0];
        
        for(int i=1; i<n ; i++){
            
            sum = Math.max(sum+arr[i] , arr[i]);
            
            result = Math.max(result , sum);
            
            
        }
        
        return result;
        
    }
}