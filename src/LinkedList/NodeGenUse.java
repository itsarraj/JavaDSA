package LinkedList;
public class NodeGenUse {
    public static NodeGen<Integer> createLinkedList() {
        NodeGen<Integer> n1 = new NodeGen<>(10);
        NodeGen<Integer> n2 = new NodeGen<>(20);
        NodeGen<Integer> n3 = new NodeGen<>(30);
        NodeGen<Integer> n4 = new NodeGen<>(40);

       n1.next = n2;
       n2.next = n3;
       n3.next = n4;
       return n1;

    }
    public static void main(String[] args) {

        NodeGen<Integer> n1 = new NodeGen<>(11);
        NodeGen<String> n2 = new NodeGen<>("Anu");

        System.out.println(n1.data);
        System.out.println(n1.next);

        System.out.println(n2.data);
        System.out.println(n2.next);

    }
}
