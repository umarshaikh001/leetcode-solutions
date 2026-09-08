import java.util.ArrayList;
import java.util.List;

public class LC39_CombinationSum {

    static void  solve(int[] candidate,int target, int index, List<Integer> output, List<List<Integer>> ans) {

        // base case
        if(target == 0) {
            // agar humere target 0 ho gaya.
            // matlab humere answer readay hai .
            // answer ko store kara lo.
            ans.add(new ArrayList(output));
            return ;
        }

        if(target < 0) {
            return ;
        }

        if(index >= candidate.length) {
            return ;
        }


        //output main current value add karo.
        output.add(candidate[index]);

        //1 case hum solve karenge. baki recusion sambhal lega.
        // include call
        // humere target hai 7 or current value ho 2 toh hum 7 - 2 karenge .
        // or jab tak 2 used karenge tab tak base case hit nahi ho jata.
        // q ki hum all unique combination chaiye.

        solve(candidate, target-candidate[index], index, output, ans);

        // backtracking
        output.remove(output.size()-1);

        // exclude call.
        // humere target hai 7 or index hai 2.
        //hum exclude kar rahe hai matlab hume next index par jana hai isliye index + 1.
        solve(candidate, target, index+1, output, ans);
    }

    static  List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans =  new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;

        solve(candidates, target, index, output, ans);
        return  ans;
    }

    public static void main(String[] args) {
        
        int[] candidates = {2,3,6,7};
        System.out.println(combinationSum(candidates, 7));
    }
    
}
