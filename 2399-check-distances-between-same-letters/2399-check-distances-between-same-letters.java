class Solution {
    public static boolean checkDistances(String s, int[] distance) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            for (int j=i+1; j<s.length(); j++) {
                if(ch==s.charAt(j)) {
                    map.put(ch,Math.abs(i - j)-1);
                }
            }
        }
        int count=0;
        for(char ch:map.keySet()){
            if(distance[ch-97]== map.get(ch)){
                count++;
            }
        }
        return count==s.length()/2;
    }
}