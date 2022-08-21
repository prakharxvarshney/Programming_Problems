class Solution {
    public static String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();

        int n = key.length();

        char c  = 'a';

        for(int i=0;i<n;i++)
        {
            char ch = key.charAt(i);
            if(ch==' ')
            {
                continue;
            }
            if(!map.containsKey(ch))
            {
                map.put(ch,c);
                c = (char)(c+1);
            }
        }

        String ans = "";

        int m = message.length();

        for(int i=0;i<m;i++)
        {
            char ch = message.charAt(i);

            if(ch==' ')
            {
                ans += " ";
            }
            else
                ans += (map.get(ch));
        }

        return ans;
    }
}