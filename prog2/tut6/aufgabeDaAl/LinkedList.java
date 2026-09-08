package prog2.tut6.aufgabeDaAl;

public class LinkedList<E> {

    private Node<E> head;

    public LinkedList() {
        head = null;
    }


    public int size() {

        int count = 0;
        Node<E> current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public boolean contains(E element) {

        Node<E> current = head;

        while (current != null) {

            if (current.data.equals(element)) {
                return true;
            }

            current = current.next;
        }

        return false;
    }


    public void addFirst(E element) {

        Node<E> newNode = new Node<>(element);

        newNode.next = head;
        head = newNode;
    }


    public void addLast(E element) {

        Node<E> newNode = new Node<>(element);

        if (head == null) {
            head = newNode;
            return;
        }


        Node<E> current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void printList() {

        Node<E> current = head;

        while (current != null) {

            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}
