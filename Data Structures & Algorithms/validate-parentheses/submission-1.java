class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> pDict = new HashMap<>();
        pDict.put(')', '(');
        pDict.put(']', '[');
        pDict.put('}', '{');
        
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            // if see closing, pop
            if (pDict.containsKey(ch)) {
                if (stack.peek() == pDict.get(ch)){
                    stack.pop();
                }
                else {
                    return false;
                }
            } 
            // else of see opening, push opening in stack
            else {
                stack.push(ch);
            }
        }
        return stack.size() == 0;
    }
}
