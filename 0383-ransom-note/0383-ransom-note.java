class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        // ransomNote ke characters count karo
        for (char c : ransomNote.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        // magazine ke characters count karo
        for (char c : magazine.toCharArray()) {
            have.put(c, have.getOrDefault(c, 0) + 1);
        }

        // Check karo ki magazine mein required characters hain ya nahi
        for (char c : need.keySet()) {
            if (have.getOrDefault(c, 0) < need.get(c)) {
                return false;
            }
        }

        return true;
    }
}