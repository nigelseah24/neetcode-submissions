class Solution {
    public boolean isPalindrome(String s) {
        // two pointers to the middle 
        int l = 0; 
        int r = s.length() - 1;

        while (r > l) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (r > l && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }

        return true;

        // for (char ch : s.toCharArray()) {
        //     System.out.println("ch: " + ch);
        // }

        // StringBuilder sb = new StringBuilder();
        // for (char ch : s.toCharArray()) {
        //     sb.append(ch);
        // }
        // String sbResult = sb.toString();

        // String[] words = s.split(" ");

        // String substring3 = s.substring(0,3);
        // System.out.println("sb: " + sbResult);
        // System.out.println("substring3: " + substring3);

        // Character charAtOne = s.charAt(1);
        // System.out.println("char at one: " + charAtOne);

        // // map
        // Map<Character, String> uppercaseMap = new HashMap<>();

        // // put
        // uppercaseMap.put('a', "A");
        // uppercaseMap.put('c', "C");

        // // boolean comparison = (uppercaseMap.getOrDefault('a', "A2")).equals((uppercaseMap.getOrDefault('c', "C2")));
        // // boolean comparison = (uppercaseMap.getOrDefault('a', "A2")) == ((uppercaseMap.getOrDefault('c', "C2")));

        // // contains
        // boolean containsA = uppercaseMap.containsKey("a");

        // // get
        // String a = uppercaseMap.get('a');

        // // getOrDefault
        // String b = uppercaseMap.getOrDefault('b', "B");

        // for (Map.Entry<Character, String> e : uppercaseMap.entrySet()) {
        //     System.out.println("Key e " + e.getKey());
        //     System.out.println("Value e " + e.getValue());
        // }

        // System.out.println("String A " + a);
        // System.out.println("String B " + b);
        // System.out.println("Contains A " + containsA);

        // // list
        // List<Integer> intList = new ArrayList<>();
        // intList.add(1);
        // intList.add(2);
        // System.out.println("intList: " + intList);
        // intList.remove(intList.size()-1);
        // System.out.println("intList after removal: " + intList);
        // System.out.println("intList get 1: " + intList.get(0));

        // // stack
        // Deque<Character> charStack = new ArrayDeque<>();
        // charStack.push('a');
        // charStack.push('b');
        // System.out.println("charStack: " + charStack);
        // Character popped = charStack.pop();
        // System.out.println("popped: " + popped);
        // charStack.offerFirst('b');
        // charStack.push('c');
        // System.out.println("charStack: " + charStack);
        // System.out.println("peeked: " + charStack.peek());

        // // queues and deques
        // Deque<Integer> q = new ArrayDeque<>();
        // q.offerFirst(1);
        // q.offerLast(2);
        // System.out.println("q: " + q);
        // q.pollLast();
        // System.out.println("q after poll: " + q);

        // // minHeap (Priority queue)
        // PriorityQueue<Character> pq = new PriorityQueue<>();
        // pq.offer('a');

        // // linkedlist
        // class ListNode {
        //     int val;
        //     ListNode next;
        //     ListNode(int val) {
        //         this.val = val;
        //     }
        // }

        // ListNode node0 = new ListNode(0);
        // ListNode node1 = new ListNode(1);
        // node0.next = node1;

        // System.out.println("node0: " + node0);
        // System.out.println("node0: " + node0.val);
        // System.out.println("node1: " + node1.val);

        // return containsA;
    }
}