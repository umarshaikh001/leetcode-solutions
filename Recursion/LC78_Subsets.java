import java.util.ArrayList;
import java.util.List;

public class LC78_Subsets {

    static  void solve(int[] nums, int index, List<Integer> output, List<List<Integer>> ans) {

        // base case 
        if(index >= nums.length) {

            ans.add(new ArrayList<>(output));
            return ;
        }

        int currentValue = nums[index];
        output.add(currentValue);

        // include
        solve(nums, index+1, output, ans);

        // backtracking
        output.remove(output.size()-1);

        // exclude
        solve(nums, index+1, output, ans);
    }

    static  List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;
        solve(nums,index,output,ans);
        return  ans;
    }

    public static void main(String[] args) {
        
    }
    
}
