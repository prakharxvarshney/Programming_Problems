class Solution {
    public static String intToRoman(int num) {
        int[] integer = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<integer.length;i++) {
            while(num>=integer[i]) {
                ans.append(roman[i]);
                num-=integer[i];
            }
        }
        return ans.toString();
    }
}