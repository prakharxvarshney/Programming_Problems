class Solution {
    public static char repeatedCharacter(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),1);
            }
            else {
                return s.charAt(i);
            }
        }
        return 'a';
    }
}