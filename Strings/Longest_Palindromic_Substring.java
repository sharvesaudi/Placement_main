package Strings;

public class Longest_Palindromic_Substring{
    public static String longestPalindrome(String s) {
        String str="";
        int len = 0;
        //even length
        for(int i=0;i<s.length();i++){
            int l=i;
            int r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1 > len){
                    str=s.substring(l,r+1);
                    len=r-l+1;
                }
                r++;
                l--;
            }
        }

        //odd length
        for(int i=0;i<s.length();i++){
            int l=i;
            int r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1 > len){
                    str=s.substring(l,r+1);
                    len=r-l+1;
                }
                l--;
                r++;
            }
        }
        return str;
    }
    public static void main(String[] args){
        System.out.print(longestPalindrome("babad"));
    }
}