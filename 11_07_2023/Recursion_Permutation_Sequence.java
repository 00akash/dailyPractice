public class Recursion_Permutation_Sequence {
    class Solution {
        public String getPermutation(int n, int k) {
            ArrayList<Integer> ls = new ArrayList<>();
            int fact = 1;
    
            for(int i = 1; i<n;i++){
                fact *=i;
                ls.add(i);
            }
    
    
            ls.add(n);
            String ans = "";
            k = k-1;
            
            while(true){
                ans = ans + ls.get(k/fact);
                ls.remove(k/fact);
    
                if(ls.size()==0)break;
                k = k % fact;
                fact = fact/ls.size();
    
            }
    
            return ans;
    
        }
    }
}
