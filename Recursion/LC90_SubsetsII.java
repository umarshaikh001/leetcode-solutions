import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC90_SubsetsII {

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

        while (index + 1 <nums.length && nums[index] == nums[index + 1]) {
            index++;
            
        }

        // exclude
        solve(nums, index+1, output, ans);
    }

    static  List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;
        solve(nums,index,output,ans);
        return  ans;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,2};
        System.out.println(subsetsWithDup(nums));
        
    }
    
}
