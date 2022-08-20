class Solution {
   public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')) {
                sb.append(c);
            }
        }
        s = sb.toString().toLowerCase();
        String rs = sb.reverse().toString().toLowerCase();
        return (s.equals(rs));

    }
}