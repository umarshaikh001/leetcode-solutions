public class LC1910_RemoveAllOccurrencesOfASubstring {

    static String removeOccurrences(String s , String part) {


        while (s.contains(part)) {

            int index = s.indexOf(part);

            s = s.substring(0, index) + s.substring(index + part.length());
            
        }
        return s;
    }

    public static void main(String[] args) {
        
        String s = "pqxpqpqypqz";
        System.out.println(removeOccurrences(s, "pq"));
        // output = "xyz"
    }
    
}
