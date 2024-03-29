import { Node } from "./Node.js";

export class DoublyLinkedList{
    #node;
    #head;
    #tail;
    #length;

    constructor(number){
        this.#node = new Node(number);
        this.#head = this.#node;
        this.#tail = this.#node;
        this.#length = 1;
    }

    getHead(){
        return this.#head;
    }

    setHead(node){
        this.#head = node;
    }

    getTail(){
        return this.#tail;
    }

    setTail(node){
        this.#tail = node;
    }

    getLength(){
        return this.#length;
    }

    increaseLength(){
        this.#length = this.#length + 1;
    }

    decreaseLength(){
        if(this.#length > 0){
            this.#length = this.#length - 1;
        }
    }

    #indexIsValid(index){
        return (index >= 0 && index <= this.getLength()) ? true : false;
     }

    printList(){
        let actualNode = this.#head;
        if(this.getLength() == 0 ){
            console.log("List is empty.")
            return;
        }
        while(actualNode != null){
            process.stdout.write(actualNode.getNumber() + " ");
            actualNode = actualNode.getNextNode();
        }
        console.log("");
        console.log("First number of the list: " + this.getHead().getNumber());
        console.log("Last number of the list: " + this.getTail().getNumber());
        console.log("List length: " + this.getLength());
    }

    addAtTheEnd(number){
        let newNode = new Node(number);
        if(this.getLength() == 0){
            this.setHead(newNode);
            this.setTail(newNode);
        }
        else{
            newNode.setPreviousNode(this.getTail());
            this.getTail().setNextNode(newNode);
            this.setTail(newNode);
        }
        this.increaseLength();
    }

    addAtTheBeginning(number){
        let newNode = new Node(number);
        if(this.getLength() == 0){
            this.setHead(newNode);
            this.setTail(newNode);
        }
        else{
            this.getHead().setPreviousNode(newNode);
            newNode.setNextNode(this.getHead());
            this.setHead(newNode);
        }
        this.increaseLength();
    }

    insertByIndex(index, number){
        if(this.#indexIsValid(index)){
            if(index == 0){
                this.addAtTheBeginning(number);
            }
            else if(index == this.getLength()){
                this.addAtTheEnd(number);
            }
            else{
                let actualNode = this.getHead();
                let actualIndex = 0;
                let newNode = new Node(number);
                while(actualIndex < index - 1){
                    actualIndex++;
                    actualNode = actualNode.getNextNode();
                }
                newNode.setNextNode(actualNode.getNextNode());
                newNode.setPreviousNode(actualNode);
                let nextNode = newNode.getNextNode();
                nextNode.setPreviousNode(newNode);
                actualNode.setNextNode(newNode);
                this.increaseLength();
            }
        }
        else{
            console.log("Invalid index given the actual list length");
        }
    }
}