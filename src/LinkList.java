public class LinkList {
    private Node head;

    public LinkList(){
        head = null;
    }

    public LinkList(int[] values){
        head = new Node(values[0]);
        Node n = head;
        for (int i = 1; i < values.length; i++){
            Node adding = new Node(values[i]);
            n.setNext(adding);
            n = n.getNext();
        }
    }
    public void addItem(int v){
        Node n = new Node(v);
        if (head == null){
            head = n;
        } else {
            //walk the list to the end
            Node current = head;
            Node previous = null;
            while (current != null){
                previous = current;
                current = current.getNext();
            }
            previous.setNext(n);
        }

        //Node current = head;
        //while(current != null){
        //    if (current.getNext() == null) {
        //        current.setNext(n);
        //    }
        //    current = current.getNext();
        //}


    }

}