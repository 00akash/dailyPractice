import java.util.*;
public class Recursive_subset_sum {
    public static void main(String[] args) {
        int arr[] = {10,5,2,3,6};
        int sum = 8;

        int n = arr.length;
        List<List<Integer>> lst = new ArrayList<>();

        subsetSum(arr,sum,n,new ArrayList<>(),lst);

        for(List<Integer> ast: lst){
            System.out.print("{ ");
        
            for(int as:ast){
                System.out.print(as+" ");
            }
            System.out.print(" }");
            System.out.println();
        }
    }

    static  void subsetSum(int[] arr, int sum, int n,List<Integer> ls,List<List<Integer>> lst){
        // if(sum==0){
        //     lst.add(new ArrayList<>(ls));
        //     return;
        // }
        if(n==0){
            if(sum==0){
                lst.add(new ArrayList<>(ls));
                return;
            }
          return;
        }

        if(arr[n-1]<=sum){
            ls.add(arr[n-1]);
            subsetSum(arr,sum-arr[n-1],n-1,ls,lst);
            ls.remove( ls.size()-1);
            subsetSum( arr, sum,  n-1, ls,  lst );
        }
        else
           subsetSum(arr,sum,n-1,ls,lst);
    }
}
