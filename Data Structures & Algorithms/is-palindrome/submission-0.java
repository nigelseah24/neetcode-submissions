class Solution {
    public boolean isPalindrome(String s) {
        // 2 pointers
    
        String input = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int l = 0;
        int r = input.length() - 1;

        System.out.println(l);
        System.out.println(r);

        while (l < r) {
            if (input.charAt(l) != input.charAt(r)) {
                return false;
            }
            l = l + 1;
            r = r - 1;
            if (l == r && input.charAt(l) == input.charAt(r)) {
                break;
            }
        }

        return true;
    }
}