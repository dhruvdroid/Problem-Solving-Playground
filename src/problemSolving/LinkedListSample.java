package problemSolving;

import java.util.LinkedList;

public class LinkedListSample {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);
        // [D, A, E, B, C]

        reverLL(ll);
    }

    private static void reverLL(LinkedList ll) {
        Object current = ll.getFirst();
        Object next = ll.get(1);

        while (current != null) {
//            Object temp =
        }
    }
}
