public class Recursion_Subset_Sum {
    class Solution{
        ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
            // code here
            ArrayList<Integer> ls = new ArrayList<>();
            SubsetSum(arr,N,0,ls);
            return ls;
    
        }
        
       void SubsetSum(ArrayList<Integer> arr, int N,int sum, ArrayList<Integer> ls){
            if(N==0){
                ls.add(sum);
                return;
            }
    
            SubsetSum(arr,N-1,sum+arr.get(N-1),ls);
            SubsetSum(arr,N-1,sum,ls);
        }
    }
}
