public class Array2_find_duplicate_circular_way {

        public int findDuplicate(int[] arr) {
            // int a = arr[0];
            //     while(arr[a]!=0){
            //     if(arr[a]!=0) {
            //         int temp =arr[a];
            //         arr[a]=0;
            //         a = temp;
            //     }
            //     else{
            //         return a;
            //     }
            // }
    
            // return a;
             int n = arr.length;
             int a = arr[0];
             arr[0] = 0;
             if(a>=n)a = n-1;
                while(a<n && arr[a]!=0 ){
                if(arr[a]!=0) {
                    int temp =arr[a];
                    arr[a]=0;
                    a = temp;
                    if(a>=n) a = n-1;
                }
                else{
                    return a;
                }
            }
    
            return a;
        }
    
}
