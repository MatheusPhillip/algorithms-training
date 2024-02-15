import { LinkedList } from "../Model/LinkedList.js"

let myLinkedList = new LinkedList(15);

myLinkedList.addAtTheEnd(50);
myLinkedList.addAtTheEnd(60);
myLinkedList.addAtTheEnd(70);
myLinkedList.addAtTheBeginning(40);
myLinkedList.addAtTheBeginning(30);

myLinkedList.insertByIndex(1, 20);

myLinkedList.printList();

myLinkedList.removeByIndex(3);


myLinkedList.printList();