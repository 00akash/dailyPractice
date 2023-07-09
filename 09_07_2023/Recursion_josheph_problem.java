import java.util.*;
public class Recursion_josheph_problem {
    public static void main(String[] args) {
        int n = 5;// number of the apple in circle.
        int k = 3;// position start with 0 and we need to cut apple in kth position

        Recursion_josheph_problem  r= new Recursion_josheph_problem();
        System.out.println(r.joseph(n,k));// if it start index start with 1 then simple add 1 in the answer because 0 1 2 3 changes 0+1 1+1 2+1 3+1

    }

     int joseph(int n, int k){
        if(n==1) return 0;
        return (joseph(n-1,k)+k)%n;
    }
}
