class LRUCache {

    private class Node {
        private int key;
        private int value;
        Node prev, next;

        public Node (int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private HashMap<Integer, Node> cache;
    private final Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();

        this.head = new Node(0,0);
        this.tail = new Node(0,0);

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        // Get node
        Node node = cache.get(key);

        // Remove from list
        removeFromList(node);
        // Add to front of the list (MRU)
        insertFront(node);

        return node.value;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            removeFromList(cache.get(key));
        }
        // new node
        Node node = new Node(key, value);

        // put at front
        cache.put(key, node);
        
        // put it to the front
        insertFront(node);

        if (cache.size() > capacity) {
            Node lru = tail.prev;
            removeFromList(lru);
            cache.remove(lru.key);
        }
    }

    private void removeFromList(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertFront(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}
