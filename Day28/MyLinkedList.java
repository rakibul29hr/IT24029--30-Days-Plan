public class MyLinkedList {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    public void add(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public int get(int index) {
        checkIndex(index);

        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public int removeFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        int data = head.data;
        head = head.next;
        size--;

        return data;
    }

    public int removeLast() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        if (head.next == null) {
            int data = head.data;
            head = null;
            size--;
            return data;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        int data = current.next.data;
        current.next = null;
        size--;

        return data;
    }

    public int remove(int index) {
        checkIndex(index);

        if (index == 0) {
            return removeFirst();
        }

        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        int data = current.next.data;
        current.next = current.next.next;
        size--;

        return data;
    }

    public boolean contains(int data) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addFirst(10);
        list.addFirst(5);
        list.addLast(20);
        list.addLast(30);

        list.printList();

        list.add(2, 15);
        list.printList();

        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Contains 20: " + list.contains(20));
        System.out.println("Size: " + list.size());

        list.removeFirst();
        list.removeLast();
        list.remove(1);

        list.printList();
    }
}
