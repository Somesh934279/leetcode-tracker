// Last updated: 7/9/2026, 9:49:15 AM
class MyHashSet {

    private class Node {
        int key;
        Node next;

        Node(int k) {
            key = k;
        }
    }

    private Node[] buckets;
    private int capacity;
    private int size;
    private final double LOAD_FACTOR = 0.75;

    public MyHashSet() {
        capacity = 16;
        buckets = new Node[capacity];
    }

    public void add(int key) {
        put(key);
    }

    public void remove(int key) {
        removeNode(key);
    }

    public boolean contains(int key) {

        int index = hash(key);
        Node curr = buckets[index];

        while (curr != null) {

            if (curr.key == key) {
                return true;
            }

            curr = curr.next;
        }

        return false;
    }

    private int hash(int key) {
        return (key & 0x7fffffff) % capacity;
    }

    private void put(int key) {

        int index = hash(key);
        Node curr = buckets[index];

        while (curr != null) {

            if (curr.key == key) {
                return;
            }

            curr = curr.next;
        }

        Node node = new Node(key);
        node.next = buckets[index];
        buckets[index] = node;

        size++;

        if ((double) size / capacity >= LOAD_FACTOR) {
            rehash();
        }
    }

    private void removeNode(int key) {

        int index = hash(key);

        Node curr = buckets[index];
        Node prev = null;

        while (curr != null) {

            if (curr.key == key) {

                if (prev == null) {
                    buckets[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }

                size--;
                return;
            }

            prev = curr;
            curr = curr.next;
        }
    }

    private void rehash() {

        Node[] oldBuckets = buckets;

        capacity *= 2;
        buckets = new Node[capacity];
        size = 0;

        for (Node head : oldBuckets) {

            while (head != null) {
                put(head.key);
                head = head.next;
            }
        }
    }
}