import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arr = new ArrayList<>();
        helper(arr, "", n, 0, 0);
        return arr;
    }

    public void helper(List<String> arr, String s, int n, int left, int right) {
        // Base case: if we have used all ')' (right == n), add the string to the result
        if (right == n) {
            arr.add(s);
            return;
        }

        // Add '(' if we haven't used all '(' yet
        if (left < n) {
            helper(arr, s + '(', n, left + 1, right);
        }

        // Add ')' if we have more '(' than ')'
        if (right < left) {
            helper(arr, s + ')', n, left, right + 1);
        }
    }
}