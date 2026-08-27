import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GFG_AllSubsequencesOfAString {

   static void getAllSubSequence(String s, int index, StringBuilder output, List<String> ans) {

    // base case

    if(index >= s.length()) {
        String subSequence = output.toString();
        ans.add(subSequence);
        return;
    }


    // charactor
    char ch = s.charAt(index);
    // add this on output
    output.append(ch);

    // include and call recursion
    getAllSubSequence(s, index+1, output, ans);
    //exclude and call recursion
    // but if you call exclude so delete the last charactor
    output.deleteCharAt(output.length()-1);
    getAllSubSequence(s, index+1, output, ans);
   }


    static List<String> powerSet(String s) {

        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        // Charactor Index
        int index = 0;

        getAllSubSequence(s,index,output,ans);
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(powerSet("abc"));
        
    }
    
}
