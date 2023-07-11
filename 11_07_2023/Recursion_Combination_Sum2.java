public class Recursion_Combination_Sum2 {
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            
            Arrays.sort(candidates);
         List<List<Integer>> ans = new ArrayList<>();
        solve(candidates,0,target,candidates.length,new ArrayList<>(),ans);
    
        return ans;
        }
    
        void solve(int[] nums,int ind, int sum, int n, List<Integer> ls, List<List<Integer>> ans){
           
                if(sum==0){
                ans.add(new ArrayList<>(ls));
                }
        for(int i = ind; i<n;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            if(nums[i]<=sum){
                ls.add(nums[i]);
                solve(nums,i+1,sum-nums[i],n,ls,ans);
                ls.remove(ls.size()-1);
            }
    
        }
        }
    }
}
