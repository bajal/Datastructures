package lists;

/**
 * Created by Bajal on 8/26/16.
 */
public class SinglyLinkedList<T> implements IList<T> {

    private Node<T> head;
    private int size;

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        //Put some data in
        singlyLinkedList.addMultiple(1, 2, 3);
        singlyLinkedList.add("Bajal");
        singlyLinkedList.addMultiple(4, 5, 7, 8);

        //Remove "Bajal"
        singlyLinkedList.remove("Bajal");
       // singlyLinkedList.remove(8);

        singlyLinkedList.print();

    }

    @Override
    public void print() {

        Node current = head;
        System.out.println("List Size:" + size);
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
    }

    @Override
    public void add(T element) {

        Node<T> nd = new Node<T>();
        nd.data = element;
        //System.out.println("Adding: " + element);

        if (head == null) {
            head = nd;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = nd;
        }
        size++;
    }

    @Override
    public void addMultiple(T... elements) {

        Node<T> nd = new Node<T>();
        for (T element : elements) {
            add(element);
        }
    }

    @Override
    public void remove(T element) {
        if(head == null) throw new RuntimeException("cannot delete");

        if( head.data.equals(element) ) {
            head = head.next;
            return;
        }
        
        Node cur = head;
        Node prev = null;

        while(cur != null && !cur.data.equals(element) ) {
            prev = cur;
            cur = cur.next;
        }
        if(cur == null) throw new RuntimeException("cannot delete");

        //delete cur node
        prev.next = cur.next;
    }

    @Override
    public void insertAfter(T element) {

    }

    @Override
    public void insertBefore(T element) {

    }
}
