public class Array2_Merge_interval {
    class Solution {

        // void sort_by_colomn(int[][]arr, int col){
        //     Arrays.sort(arr,new Comparator<int[]>(){
    
        //         @Override
        //         public int compare(final int[]col1, final int[]col2){
        //             if(col1[col]>col2[col]) return 1;
        //             else if(col1[col]==col2[col] && col1[col+1]>col2[col+1] ) return 1;
        //             else return -1;
        //         }
        //     });
        // }
        public int[][] merge(int[][] intervals) {
            
             Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
            // sort_by_colomn(intervals,0);
    
            int r = intervals.length;
            int count = 0;
            int end = -1;
            for(int i = 0; i<r;i++){
    
                if(end>intervals[i][0]) continue;
                end = intervals[i][1];
                for(int j = i+1;j<r;j++){
                    if(end>=intervals[j][0]){
                        end = Math.max(end,intervals[j][1]);
                        intervals[j][1] = -1;
                        count++;
                    }else break;
                }
    
                intervals[i][1] = end;
            }
    
            int new_row = r-count;
            int [][]ans = new int[new_row][2];
            int a = 0;
            for(int i = 0; i<r;i++){
                if(intervals[i][1]!=-1 && new_row>0){
                    ans[a][0] = intervals[i][0];
                    ans[a][1] = intervals[i][1];
                    a++;
                    new_row--;
                }
            }
    
            return ans;
        }
    }
}
