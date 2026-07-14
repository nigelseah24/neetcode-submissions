class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sCharCount = new HashMap<>();
        HashMap<Character, Integer> tCharCount = new HashMap<>();

        for (char ch : s.toCharArray()) {
            sCharCount.put(ch, sCharCount.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            tCharCount.put(ch, tCharCount.getOrDefault(ch, 0) + 1);
        }

        return sCharCount.equals(tCharCount);
    }
}
