class Solution {
    public static String convertToTitle(int columnNumber) {
        String result = "";
        while(columnNumber > 0) {
            int rem = columnNumber % 26;
            char ch = 'A';
            if (rem == 0) {
                ch = 'Z';
                columnNumber = (columnNumber/26) - 1;
            } else {
                ch = (char)('A' + rem - 1);
                columnNumber /= 26;
            }
            result = ch + result;
        }
        return result;
    }
}