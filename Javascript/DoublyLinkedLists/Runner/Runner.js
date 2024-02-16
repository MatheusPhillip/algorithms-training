import { DoublyLinkedList } from "../Model/DoublyLinkedList.js";

let myLinkedList = new DoublyLinkedList(40);

myLinkedList.printList();

myLinkedList.addAtTheBeginning(30);
myLinkedList.addAtTheBeginning(20);
myLinkedList.addAtTheBeginning(10);

myLinkedList.insertByIndex(2, 15);

console.log(myLinkedList.getHead().getNumber());


myLinkedList.printList();


