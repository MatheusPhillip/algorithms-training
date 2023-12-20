import { LinkedList } from "../Model/LinkedList.js"

let myLinkedList = new LinkedList(10);

myLinkedList.addAtTheEnd(50);
myLinkedList.addAtTheEnd(60);
myLinkedList.addAtTheEnd(70);
myLinkedList.addAtTheBeginning(40);
myLinkedList.addAtTheBeginning(30);

myLinkedList.insertByIndex(10, 20);

myLinkedList.printList();

console.log(myLinkedList.getHead().getNumber());
console.log(myLinkedList.getTail().getNumber());
console.log(myLinkedList.getLength());