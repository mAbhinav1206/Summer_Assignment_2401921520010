package Week_2.Day_1;

import java.util.Arrays;

public class Valid_anagram {
    public boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr2);
        int i=0, j=0;
        while((i<arr1.length) && (j<arr2.length)) {
            if(arr1[i]!=arr2[j]) return false;
            i++;
            j++;
        }
        return true;
    }
}