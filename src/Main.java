public class Main {

    public static void main(String[] args) {
        int[] data = {1, 2, 3,};

 /*
        Node n1 = new Node(69);
        Node n2 = new Node(6);
        Node n3 = new Node(9);

        n1.setNext(n2);
        n2.setNext(n3);

        n1.display();
*/

        LinkList mylist = new LinkList(data);
        mylist.head().display();
        mylist.head().getNext().display();
        mylist.head().getNext().getNext().display();
        mylist.head().getNext().getNext().getNext().display();

    }
}
