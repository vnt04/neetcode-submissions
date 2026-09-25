class Solution {
    public boolean isAnagram(String s, String t) {
 /**
            what is anagram?
            1. same character set
            2. frequent of each character is same.
            3. The order is skipped.
         */
        if (s.length() != t.length())
            return false;
        int n = s.length();

        int[] countChar = new int[26];
        for (int i = 0; i < n; i++) {
            countChar[s.charAt(i) - 'a']++;
            countChar[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++) {
            if(countChar[i] != 0) {
                return false;
            }
        }
        return true;
    }
    
}
