import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> openBrackets = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // Record the current length of the builder where the matching '(' belongs
                openBrackets.push(sb.length());
            } else if (c == ')') {
                // Get the start position of the inner substring
                int start = openBrackets.pop();
                // Reverse the substring inside the StringBuilder from 'start' to the end
                reverse(sb, start, sb.length() - 1);
            } else {
                // Append normal lowercase English characters
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
    
    private void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }
}
