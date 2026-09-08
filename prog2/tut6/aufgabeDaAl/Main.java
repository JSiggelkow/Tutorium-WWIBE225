package prog2.tut6.aufgabeDaAl;

public class Main {
    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addFirst(10);
        list.addFirst(5);
        list.addLast(20);
        list.addLast(30);

        list.printList();

        System.out.println("Größe: " + list.size());

        System.out.println("Enthält 20? " + list.contains(20));
        System.out.println("Enthält 99? " + list.contains(99));
    }
}
