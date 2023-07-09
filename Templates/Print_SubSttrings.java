package Templates;
public class Print_SubSttrings {
    public static void main(String[] args){
        String str = "abcde";
        int n = str.length();
        Three_loops(str, n);
        Two_loops(str,n);
    }
    public static void Two_loops(String string, int n) {
        // Generate all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(string.substring(i, j));
            }
        }
    }
    
    public static void Three_loops(String str, int n){
        // Pick starting point
        for (int len = 1; len <= n; len++) {
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                //  Print characters from current
                // starting point to current ending point. 
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(str.charAt(k));
                }
 
                System.out.println();
            }
        }
    }
}
