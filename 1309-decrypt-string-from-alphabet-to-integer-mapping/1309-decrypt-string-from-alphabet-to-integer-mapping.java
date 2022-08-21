class Solution {
    public static String freqAlphabets(String s) {
        int j=1;
        StringBuilder s2 = new StringBuilder();
        HashMap<Integer,Character> map = new HashMap<>();
        for(int i=97;i<=122;i++) {
            map.put(j,(char)i);
            j++;
        }
        for(int i=s.length()-1;i>=0;i--) {
            StringBuilder s1 = new StringBuilder();
            if(s.charAt(i)=='#') {
                s1.append(s.charAt(i-1));
                s1.append(s.charAt(i-2));
                i=i-2;
                int index = Integer.parseInt(s1.reverse().toString());
                s2.append(map.get(index));
            }
            else if(s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9'){
                int index = Character.getNumericValue(s.charAt(i));
                s2.append(map.get(index));
            }
        }
        return s2.reverse().toString();
    }
}