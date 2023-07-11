public class Recursion_Palindrome_Partitioning {
    class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> ans = new ArrayList<>();
            solve(s,0,s.length(),new ArrayList<String>(),ans);
            return ans;
        }
    
        void solve(String s, int ind, int n, List<String> ls, List<List<String>> ans){
            if(ind==n){
             ans.add(new ArrayList<>(ls));
                return;
            }
            for(int i = ind; i<n;i++){
                if(checkPalindrome(s,ind,i)){
                    ls.add(s.substring(ind,i+1));
                    solve(s,i+1,n,ls,ans);
                    ls.remove(ls.size()-1);
                }
            }
        }
    
        boolean checkPalindrome(String st,int s, int e){
            if(s>=e)return true;
            if(st.charAt(s)!=st.charAt(e)) return false;
            return checkPalindrome(st,s+1,e-1);
    
        }
    }
}
