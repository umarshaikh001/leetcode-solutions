package HashMap;

import java.util.HashMap;

public class FindFirstRepeatingElementInArray {

    static int findFirstRepeatingElement(int nums[]) {
        HashMap<Integer,Integer> output = new HashMap<>();

        for(int i : nums) {
            output.put(i, output.getOrDefault(i, 0)+1);
        }

        for(int i : output.keySet()) {
            if(output.get(i) > 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        
        int [] nums ={2,3,4,5,5,5,5};
        System.out.println(findFirstRepeatingElement(nums));
        
    }
    
}
