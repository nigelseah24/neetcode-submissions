class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<String, String> mapDict = new HashMap<>();

        int l = 0;
        int r = l + 1;

        while (l != numbers.length - 1){
            if (numbers[r] == target - numbers[l]) {
                return new int[] {l+1, r+1};
            }
            r = r + 1;

            if (r == numbers.length) {
                l = l + 1;
                r = l + 1;
            }
        }

        return new int[] {};
    }
}
