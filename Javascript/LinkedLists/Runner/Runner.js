import { LinkedList } from "../Model/LinkedList.js"

let myLinkedList = new LinkedList(10);

myLinkedList.addAtTheEnd(20);
myLinkedList.addAtTheEnd(30);
myLinkedList.addAtTheEnd(40);
myLinkedList.addAtTheBeginning(1);
myLinkedList.addAtTheBeginning(0);


myLinkedList.printList();

console.log(myLinkedList.getHead().getNumber());
console.log(myLinkedList.getTail().getNumber());
console.log(myLinkedList.getLength());