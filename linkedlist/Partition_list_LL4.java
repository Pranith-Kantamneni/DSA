class LinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        length = 0;
    }
    
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

  public void partitionList(int x) {
    if (head == null || head.next == null) return;

    Node beforeStart = null;
    Node beforeEnd = null;
    Node afterStart = null;
    Node afterEnd = null;

    Node current = head;
    while (current != null) {
        Node next = current.next;
        current.next = null;

        if (current.value < x) {
            if (beforeStart == null) {
                beforeStart = current;
                beforeEnd = beforeStart;
            } else {
                beforeEnd.next = current;
                beforeEnd = current;
            }
        } else {
            if (afterStart == null) {
                afterStart = current;
                afterEnd = afterStart;
            } else {
                afterEnd.next = current;
                afterEnd = current;
            }
        }
        current = next;
    }

    // Merge the two lists
    if (beforeStart == null) {
        head = afterStart;
    } else {
        beforeEnd.next = afterStart;
        head = beforeStart;
    }
}


}

public class Partition_list_LL4 {

    public static void main(String[] args) {

        // Create a new LinkedList and append values to it
        LinkedList ll = new LinkedList(3);
        ll.append(5);
        ll.append(8);
        ll.append(10);
        ll.append(2);
        ll.append(1);

        // Print the list before partitioning
        System.out.println("LL before partitionList:");
        ll.printList(); // Output: 3 5 8 10 2 1

        // Call the partitionList method with x = 5
        ll.partitionList(5);

        // Print the list after partitioning
        System.out.println("LL after partitionList:");
        ll.printList(); // Output: 3 2 1 5 8 10

        /*
            EXPECTED OUTPUT:
            ----------------
            LL before partition_list:
            3
            5
            8
            10
            2
            1
            LL after partition_list:
            3
            2
            1
            5
            8
            10

        */

    }

}






























