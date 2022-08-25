class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map  = new HashMap<>();
        for(int i=0;i<magazine.length();i++) {
            char ch = magazine.charAt(i);
            if(!map.containsKey(ch)) {
                map.put(ch,1);
            }
            else {
                int n = map.get(ch);
                map.put(ch,n+1);
            }
        }
        int c= 0;
        for(int i=0;i<ransomNote.length();i++) {
            char ch = ransomNote.charAt(i);
            if (map.containsKey(ch) && map.get(ch)>0) {
                int n = map.get(ch);
                c++;
                map.put(ch, n - 1);
            } else {
                break;
            }
        }
        if(c==ransomNote.length()) {
            return true;
        }
        else return false;
    }
}