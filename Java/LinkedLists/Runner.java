package LinkedLists;

import LinkedLists.Model.LinkedList;


public class Runner {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.printList();

        list.insertAtTheEnd(1);
        list.insertAtTheEnd(2);
        list.insertAtTheEnd(0);

        list.printList();

        list.insertAtTheBeginning(7);
        list.insertAtTheBeginning(9);

        list.printList();

        list.deleteByValue(7);
        
        list.printList();
    }
    
}
