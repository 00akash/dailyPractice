public class Array2_merge_sorted_array {
    class Solution {

        void swap(int[] nums1, int[] nums2,int left,int right){
            if(nums1[left]>nums2[right]){
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
            }
        }
        public void merge(int[] nums1, int m, int[] nums2, int n) {
    //M-1 gap method- we compare array element in the distance of gap and until gap become 0.
    
    int len = m+n;
    int gap = (len/2)+(len%2);//if 5/2 = 2.5 and i need celling value 3 that why i am adding % 
    
    while(gap>0){
        int left = 0;
        int right = left+gap;
        while(right<len){
            if(left<m && right>=m){
                swap(nums1,nums2,left,right-m);
            } else if(left>=m){
                swap(nums2,nums2,left-m,right-m);
            }else{
                swap(nums1,nums1,left,right);
            }
            left++;right++;
        }
            if(gap==1)break;
            gap  = (gap/2)+(gap%2);
    }
    
    // M-2
    
        //     if(n==0) return;
        //   for(int i = 0; i<m;i++){
        //       if(nums1[i]>nums2[0]){
        //           int temp = nums1[i];
        //           nums1[i] = nums2[0];
        //           nums2[0] = temp;
        //           for(int j = 0; j<n-1;j++){
        //               if(nums2[j]>nums2[j+1]){
        //           int temp1 = nums2[j];
        //           nums2[j] = nums2[j+1];
        //           nums2[j+1] = temp1;
        //               }else break;
        //           }
        //       }
        //   } 
          int a = 0;
          while(a<n){
              nums1[m] = nums2[a];
                m++;
                a++;
          } 
        }
    }
}
