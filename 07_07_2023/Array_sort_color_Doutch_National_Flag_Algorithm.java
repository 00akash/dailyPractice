public class Array_sort_color_Doutch_National_Flag_Algorithm {
        public void sortColors(int[] nums) {
            //Doutch_National_Flag_Algorithm--
            int n = nums.length;
            int low = 0; int mid = 0;
            int high = n-1; 
    
            while(mid<=high){
                if(nums[mid]==0){
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    mid++;
                    low++;
                }
                else if(nums[mid]==1) mid++;
                else{
                    int temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                    high--;
                }
            }
            // int zero = 0;
            // int one = 0; int two = 0;
            // int n = nums.length;
            // for(int i = 0; i<n;i++){
            //     if(nums[i]==0) zero++;
            //     if(nums[i]==1) one++;
            //     if(nums[i]==2) two++;
            // }
    
            // int ind = 0;
            //     while(zero>0){
            //         nums[ind] = 0;
            //         ind++;
            //         zero--;
            //     }
            //     while(one>0){
            //         nums[ind] = 1;
            //         ind++;
            //         one--;
            //     }
            //     while(two>0){
            //         nums[ind]  = 2;
            //         ind++;
            //         two--;
            //     }
        }
    }
