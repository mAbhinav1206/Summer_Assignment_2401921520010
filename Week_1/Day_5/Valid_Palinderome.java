package Week_1.Day_5;

public class Valid_Palinderome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        // [^a-zA-Z0-9] :- (^) is not, (a-z)lowerCase, (A-Z) upperCase, (0-9) numeric
        // [^a-zA-Z0-9] this replaces everthing that is not lowerCase, upperCase, numeric
        
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}