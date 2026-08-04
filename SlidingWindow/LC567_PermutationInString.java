

public class LC567_PermutationInString {

    static boolean compareFreq(int[] count1, int[] count2) {

        for(int i=0;i<26;i++) {
            if(count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        for(int i=0;i<s1.length();i++) {

            char ch = s1.charAt(i);
            int index = ch - 'a';
            count1[index]++;
        }

        int i = 0;
        int windowLength = s1.length();
        int[] count2 = new int[26];

        for(i=0;i<windowLength;i++) {

            char ch = s2.charAt(i);
            int index = ch - 'a';
            count2[index]++;
        }

        if(compareFreq(count1,count2) == true) {
            return true;
        }
        else {

            while (i < s2.length()) {

                char newChar = s2.charAt(i);
                int newCharIndex = newChar - 'a';
                count2[newCharIndex]++;

                int oldCharIndex = i - windowLength;
                char oldChar = s2.charAt(oldCharIndex);
                int oldCharFreq = oldChar - 'a';
                count2[oldCharFreq]--;

                if(compareFreq(count1, count2) == true) {
                    return true;
                }
                i++;
            
            }
             
           

        }
         return false;
       
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
    
}
