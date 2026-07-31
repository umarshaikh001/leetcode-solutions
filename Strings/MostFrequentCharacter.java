public class MostFrequentCharacter {

    static char mostFrequentCharacter(String s){

        int[] freq = new int[26];

        for(int i=0;i<s.length();i++) {

            char ch = s.charAt(i);

            freq[ch- 'a']++;
        }

        int maxFreq = 0;
        char ans = 'a';

        for(int i=0;i<26;i++) {

            if(freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = (char)(i + 'a');
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        String s = "helloworld";
        System.out.println(mostFrequentCharacter(s));
        
    }
    
}
