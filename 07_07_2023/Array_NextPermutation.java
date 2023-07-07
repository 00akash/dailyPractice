public class Array_NextPermutation {
    public void nextPermutation(int[] nums) {
      int n = nums.length;
      boolean f = false;
      for(int i = n-1; i>0; i--){
          if(nums[i-1]<nums[i]){
              f = true;
              int temp = Integer.MAX_VALUE;
              int ind = i;
              for(int k = i; k<n;k++){
                  if(nums[k]>nums[i-1]){
                  temp = Math.min(temp,nums[k]);
                  ind = k;
                  }
              }
              int q = nums[ind];
              nums[ind] = nums[i-1];
              nums[i-1] =q;
            Arrays.sort(nums,i,n);
            break;
          }
      }  
      if(f==false) Arrays.sort(nums);
    }
}
