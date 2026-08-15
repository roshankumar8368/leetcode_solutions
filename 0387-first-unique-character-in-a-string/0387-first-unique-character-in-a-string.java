class Solution {
    public int firstUniqChar(String s) {

        int[] count = new int[26];

        // 1. Har character ka count
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // 2. Pehla character jiska count 1 hai
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}