public class MultiplyEachElementBy10 {

    static int[] MultiplyEachElement(int nums[]) {

        int n = nums.length;
        int  newArr[] = new int [n];

        for(int i=0;i<n;i++) {
            newArr[i] = nums[i]*10;
        }

        return newArr;
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int ans[] = MultiplyEachElement(arr);

        for(int i : ans) {
            System.out.print(i + " ");
        }
        
    }
    
}
