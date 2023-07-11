public class Recursion_Subset2 {
    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
        // //M1-
        //     Set<List<Integer>> st = new HashSet<>();
        //     solve(nums,nums.length,new ArrayList<>(),st);
    
        //     List<List<Integer>> lst = new ArrayList<>();
        //     // return lst.addAll(st);
        //     // return lst.copyOf(st);
        //     for (List<Integer> x : st)
        //         lst.add(x);
    
        //         return lst;
    
    //M2- 
    
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,0,nums.length,new ArrayList<>(),ans);
    
        return ans;
    
        }
    
    // //M1- 
    //     void solve(int[] nums, int n,List<Integer> ls, Set<List<Integer>> st ){
    //         if(n==0){
    //             ArrayList<Integer> temp = new ArrayList<>(ls);
    //             Collections.sort(temp);
    //             st.add(new ArrayList<>(temp));
    //             return;
    //         }
    //         ls.add(nums[n-1]);
    //         solve(nums,n-1,ls,st);
    //         ls.remove(ls.size()-1);
    //         solve(nums,n-1,ls,st);
    
    //     }
    
    //M2- 
    
    void solve(int[] nums,int ind, int n, List<Integer> ls, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ls));
        for(int i = ind; i<n;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            ls.add(nums[i]);
            solve(nums,i+1,n,ls,ans);
            ls.remove(ls.size()-1);
        }
    
    }
    
    
    }
}
