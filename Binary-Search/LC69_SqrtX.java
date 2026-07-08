

public class LC69_SqrtX {

    static int mySqrt(int x) {

        int s =0;
        int e= x;

        while (s <= e) { 
            int mid = s +(e-s)/2;

            if(mid == x / mid) {
                return mid;
            }
            else if(mid < x / mid) {
                s = mid +1 ;
            }
            else {
                mid = e -1;
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {

        int num = 36;
        System.out.println(mySqrt(num));
        
    }
    
}
