public class Array_maximumSubarraySum_Kadans_algorithm {
    public int maxSubArray(int[] nums) {

        //Kadan's Algorithm- 

        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            // for the printing the maximum sum subarray-
            // if(sum==0) start = i;
            // if(maxi<sum){
            //     maxi = sum;
            //     ansStart = start;
            //     ansEnd = i;
            // }
            sum +=nums[i];
            maxi = Math.max(sum,maxi);
            if(sum<0) sum = 0;
        }
        return maxi;
    }
}
