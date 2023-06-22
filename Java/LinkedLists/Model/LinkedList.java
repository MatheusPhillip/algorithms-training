package LinkedLists.Model;

public class LinkedList {
    Node head;

    public void append(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(new Node(data));
    }

    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.setNext(head);
        head = newHead;
    }

    public void deleteWithValue(int data){
        if(head == null) return;
        if(head.getData() == data){
            head = head.getNext();
            return;
        }

        Node current = head;
        while(current.getNext() != null){
            if(current.getNext().getData() == data){
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    public void printListData(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        Node current = head;
        while(current.getNext() != null){
            System.out.print(current.getData());
            current = current.getNext();
        }
        System.out.print(current.getData());
        System.out.println();
    }
}
