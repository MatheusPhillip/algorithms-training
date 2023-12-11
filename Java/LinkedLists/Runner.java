package LinkedLists;

import LinkedLists.Model.LinkedList;


public class Runner {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(0);

        list.printListData();

        list.prepend(7);
        list.prepend(9);

        list.printListData();

        list.deleteByValue(7);
        
        list.printListData();
    }
    
}
