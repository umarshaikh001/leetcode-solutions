import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC40_CombinationSumII {

    static  void solve(int[] candidates, int target,int index, List<Integer> output, List<List<Integer>> ans) {

        // base case
        if(target == 0) {
            ans.add(new ArrayList<>(output));
            return ;
        }

        if(target < 0) {
            return ;
        }

        if(index >= candidates.length) {
            return ;
        }

        //add currentvalue in output
        output.add(candidates[index]);

        //include call
        solve(candidates, target-candidates[index], index+1, output, ans);

        //backtracking
        output.remove(output.size()-1);

        // remove duplicate value
        while (index + 1 < candidates.length && candidates[index] == candidates[index+1] ) {
            index++;
            
        }

        //exclude call
        solve(candidates, target, index+1, output, ans);
    }

    static  List<List<Integer>> combinationSum2(int[] candidates, int target){

        //important array ko sort karo
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;
        solve(candidates,target,index,output,ans);
        return  ans;
    }

    public static void main(String[] args) {
        
        int[] candidates = {10,1,2,7,6,1,5};
        System.out.println(combinationSum2(candidates, 8));
    }
    
}
