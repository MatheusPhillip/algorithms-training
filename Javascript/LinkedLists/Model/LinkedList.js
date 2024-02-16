import {Node} from './Node.js'

export class LinkedList{
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
                actualNode.setNextNode(newNode);
                this.increaseLength();
            }
        }
        else{
            console.log("Invalid index given the actual list length");
        }
    }

    removeAtTheBeginning(){
        if(this.getLength() == 0){
            console.log("Empty list, nothing to remove.");
            return;
        }
        else if(this.getLength() == 1){
            this.#head = null;
            this.#tail = null;
            this.decreaseLength();
            console.log("List is now empty.");
        }
        else{
            this.setHead(this.getHead().getNextNode());
            this.decreaseLength();
            console.log("First index was deleted");
        }
    }

    removeAtTheEnd(){
        if(this.getLength() == 0){
            console.log("Empty list, nothing to remove.");
            return;
        }
        else if(this.getLength() == 1){
            this.#head = null;
            this.#tail = null;
            this.decreaseLength();
            console.log("List is now empty.");
        }
        else{
            let actualNode = this.getHead();
            let actualIndex = 0;
            while(actualIndex < this.getLength() - 2){
                actualIndex++;
                actualNode = actualNode.getNextNode();
            }
            actualNode.setNextNode(null);
            this.setTail(actualNode);
            this.decreaseLength();
            console.log("Last index was deleted");
        }
    }

    removeByIndex(index){
        if(!this.#indexIsValid(index)){
            console.log("Invalid index.")
            return;
        }

        if(index == 0){
            this.removeAtTheBeginning();
        }
        else if(index == (this.getLength() - 1)){
            this.removeAtTheEnd()
        }
        else{
            let actualNode = this.getHead();
            let actualIndex = 0;
            while(actualIndex < index - 1){
                actualIndex++;
                actualNode = actualNode.getNextNode();
            }
            let nextNode = actualNode.getNextNode();
            actualNode.setNextNode(nextNode.getNextNode());
            this.decreaseLength();
            console.log("Element at index " + index + " deleted.");
        }
    }

    reverse(){
        if(this.getLength() == 0){
            console.log("List is empty.");
            return;
        }
        if(this.getLength() == 1){
            return this.getHead();
        }

        let first = this.getHead();
        this.setTail(this.getHead());
        let second = first.getNextNode();

        while(second){
            const temp = second.getNextNode();
            second.setNextNode(first);
            first = second;
            second = temp;
        }

        this.getHead().setNextNode(null);
        this.setHead(first);
        return this;
    }

    #indexIsValid(index){
       return (index >= 0 && index <= this.getLength()) ? true : false;
    }
}