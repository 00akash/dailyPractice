public class Recursion_Combination_sum {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
             List<List<Integer>> ans = new ArrayList<>();
        solve(candidates,target,candidates.length,new ArrayList<>(),ans);
    
        return ans;
        }
    
        void solve(int[] nums,int sum, int n, List<Integer> ls, List<List<Integer>> ans){
            if(n==0){
                if(sum==0){
                ans.add(new ArrayList<>(ls));
                }
              return;
            }
    
            if(nums[n-1]<=sum){
                ls.add(nums[n-1]);
                solve(nums,sum-nums[n-1],n,ls,ans);
                ls.remove(ls.size()-1);
                solve(nums,sum,n-1,ls,ans);
            }else solve(nums,sum,n-1,ls,ans);
    
        }
    }
}
