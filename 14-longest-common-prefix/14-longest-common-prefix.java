class Solution {
   public static String longestCommonPrefix(String[] strs) {
        String str = new String();
        int count = 0;
        int min = Integer.MAX_VALUE;
        //This loop for check the string of minimum length in the Array.
        for (int i = 0; i < strs.length; i++) {
            int len = strs[i].length();
            if (len < min) {
                min = len;
                str = strs[i];
            }
        }

        for(int i=0;i<min;i++) {
            for(int j=0;j<strs.length;j++) {
                char[] ch = strs[j].toCharArray();
                if(str.charAt(i)!=ch[i]) {
                    return str.substring(0,count);
                }
            }
            count++;
        }
        return str.substring(0,count);

    }
}