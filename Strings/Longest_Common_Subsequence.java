package Strings;

import java.util.Arrays;
//new message
public class Longest_Common_Subsequence {
    public static void main(String[] args) {
        String text1 = "abcde", text2 = "ace";
        
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n][m];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        } 
        System.out.print(check(n-1, m-1, text1, text2, dp));
    }
    public static int check(int i, int j, String t1, String t2, int[][] dp){
        if(i<0 || j<0)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        // if(t1.charAt(i)==t2.charAt(j))
        //     return 1 + check(i-1, j-1, t1, t2);
        if(t1.charAt(i)==t2.charAt(j))
            return dp[i][j] = 1 + check(i-1, j-1, t1, t2, dp);
    
        // return Math.max(check(i-1, j, t1, t2), check(i, j-1, t1, t2));
        return dp[i][j] = Math.max(check(i-1, j, t1, t2, dp), check(i, j-1, t1, t2, dp));
    }
}
