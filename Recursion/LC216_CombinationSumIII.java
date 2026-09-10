import java.util.ArrayList;
import java.util.List;

public class LC216_CombinationSumIII {

    static void solve(int[] candidates, int index, int k,int count , int n, List<Integer> output, List<List<Integer>> ans) {

    //base case
    if(count == k && n == 0) {

        // agar count == k equal ho jaye matlab ans readay hai 3 == 3 
        //  n agar 0 ho jaye matlab target reday hai 
        ans.add(new ArrayList<>(output));
        return;
    }

    if(n < 0) {

        return;
    }

    if(index >= candidates.length) {
        return;
    }

    // output main add karo
    output.add(candidates[index]);

    //include call
      solve(candidates,index+1,k,count+1,n - candidates[index],output,ans);

    // backtracking
    output.remove(output.size()-1);

    //exclude call
    solve(candidates,index+1,k,count,n,output,ans);


    }

    static  List<List<Integer>> combinationSum3(int k, int n) {

        int[] candidates = {1,2,3,4,5,6,7,8,9};

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        // count store kar ta hai k numbers.
        int count = 0;
        int index = 0;
        solve(candidates,index,k,count,n,output,ans);
        return ans;
        
    }


    public static void main(String[] args) {
        
        System.out.println(combinationSum3(3, 9));
    }
    
}
