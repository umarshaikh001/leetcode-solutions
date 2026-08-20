

public class LC57Recursion_BasicProblem {

     static void printNto1(int n) {

        if(n == 0) {
            return;
        }

        System.out.println(n);
        printNto1(n-1);

    }

     static void print1To10(int n) {

        if(n == 0) {
           
            return ;
        }

        
        print1To10(n-1);
        System.out.println(n);
       
        

    }

    static void printArray(int[] arr, int index) {


        // base case
        if(arr.length == index) {
            return ;
        }

        // printing part
        System.out.println(arr[index]);

        // processing part
        printArray(arr, index +1);



    }

    static void FinadMaxInArray(int[] arr,int index, int max) {

        if(index == arr.length) {
            System.out.println(max);
             return ;
        }

       if(arr[index] >= max) {
        max = arr[index];
       }

       FinadMaxInArray(arr, index+1, max);
      
       
    }

    static void FinadMinInArray(int[] arr,int index , int min) {

        if(index == arr.length) {
           System.out.println(min); 
             return ;
        }

       if(arr[index] <= min) {
        min = arr[index];
       }

       FinadMinInArray(arr, index+1, min);
      
       
    }

    static void findTarget(int[] arr,int index, int target) {

        if(index >= arr.length) {
            return ;
        }

        if(target == arr[index]) {
            System.out.println(index);
        }
    
        findTarget(arr, index + 1, target);

    }

    static void findFreq(int[] arr, int index, int target, int count) {

        if(index >= arr.length) {
            System.out.println(count);
            return;
        }
       
        if(arr[index] == target) {
            count++;
        }

        findFreq(arr, index+1, target,count);
    }

    static void printDigit(int n) {

        // base case
        if(n == 0) {
            return;
        }

        // processing part
        int digit = n % 10;
        n = n / 10;

        // recursion part
        printDigit(n);

        System.out.println(digit);
    }


    public static void main(String[] args) {

        //1) printNto1(10);
    // System.out.println(); 
    
    //2)  print1To10(10);
    //  System.out.println();

    //3) int[] arr = {10,20,30,40,50};
    // printArray(arr, 0);

    //4)   int[] arr = {8,5,5,4,1,45,9,6};
    // int max = Integer.MIN_VALUE;
    //    System.out.println(FinadMaxInArray(arr, 0, max));

    //5)    int[] arr = {1,5,8,0,-8,5,8};
    //    int min = Integer.MAX_VALUE;
    //   FinadMinInArray(arr, 0, min);

    //6) int[] arr = {10,15,45,96,47};
    // findTarget(arr, 0 , 15);

    //7) int[] arr = {1,2,5,6,5,1,2,5,6};
    // findFreq(arr, 0, 6, 0);

    //8) printDigit(143);
        
    }

    
}
