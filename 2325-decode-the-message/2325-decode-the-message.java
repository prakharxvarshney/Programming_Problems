class Solution {
    public static String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        char[] ch = new char[26];
        int c=97;
        int j = 0;
        for(int i=0;i<key.length();i++) {
            if(key.charAt(i)!=(char)32) {
                if(!map.containsValue(key.charAt(i))) {
                    map.put((char)c,key.charAt(i));
                    c+=1;
                    ch[j] = key.charAt(i);
                    j++;
                }
            }
        }
        String ans = "";

        for (int i=0;i<message.length();i++) {
            if(message.charAt(i)==(char)32) {
                ans+=message.charAt(i);
            }
            else {
                for(int k =0;k<ch.length;k++) {
                    if(message.charAt(i)==ch[k]) {
                        int a=k+97;
                        ans+=(char)a;
                    }
                }
            }
        }

        return ans;
    }
}