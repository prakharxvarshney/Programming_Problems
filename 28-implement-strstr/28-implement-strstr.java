class Solution {
   public static int strStr(String haystack, String needle) {
        StringBuilder h = new StringBuilder(haystack);
        int index = -1;
        if(index<h.indexOf(needle)) {
            return h.indexOf(needle);
        }
        else return -1;

    }
}