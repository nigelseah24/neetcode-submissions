class LRUCache {

    private class Node {
        int key, value;
        Node prev, next;
        Node (int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> cache;
    // head = MRU, tail = LRU
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

        // get Node's value
        Node node = cache.get(key);
        // remove from the list
        removeNode(node);
        // offerFirst to the list
        insertFirst(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        // drop from list
        if (cache.containsKey(key)) {
            removeNode(cache.get(key));
        }
        // create new node
        Node node = new Node(key, value);
        // update cache to have new node
        cache.put(key, node);
        // mark as MRU
        insertFirst(node);

        if (cache.size() > capacity) {
            Node lru = tail.prev;
            removeNode(lru);
            cache.remove(lru.key);
        }
    }

    public void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insertFirst(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}
