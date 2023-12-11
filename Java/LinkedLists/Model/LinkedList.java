package LinkedLists.Model;

public class LinkedList {
    Node head;

    public void insertAtTheEnd(int data){
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

    public void insertAtTheBeginning(int data){
        Node newHead = new Node(data);
        newHead.setNext(head);
        head = newHead;
    }

    public void deleteByValue(int data){
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

    public void printList(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode.getNext() != null){
            System.out.print(currentNode.getData());
            currentNode = currentNode.getNext();
            System.out.print(" - ");
        }
        System.out.print(currentNode.getData());
        System.out.println();
    }

    public void findNumber(int number){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode!= null){
            if(currentNode.getData() == number){
                System.out.println("The number " + number + " is presented in the list");
                return;
            }
            currentNode = currentNode.getNext();
        }
        System.out.println("The number " + number + " is not presented in the list");
    }
}
