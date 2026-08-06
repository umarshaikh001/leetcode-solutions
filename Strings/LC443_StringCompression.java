public class LC443_StringCompression {


    static int compress(char[] chars) {

        int read = 0;
        int write = 0;

        while (read <chars.length) {

            char ch = chars[read];
            int count = 0;

            while (read < chars.length && ch == chars[read]) {
                count++;
                read++;
            }

            chars[write++] = ch;

             // Method 1 convert int -> String -> char


            if(count > 1) {

                String str = Integer.toString(count);

                for(int i=0;i<str.length();i++) {
                    
                    chars[write++] = str.charAt(i);

                }
            }

            // Method 2 convert int -> String -> char

            // if(count > 1) {
            //     String str2 = Integer.toString(count);

            //     for(char digit : str2.toCharArray()) {
            //         chars[write++] = digit;
            //     }
            // }
            
        }
        return write;
    }

    public static void main(String[] args) {
        
        char[] chars = {'a','a','b','b','b'};
        System.out.println(compress(chars));
    }
    
}
