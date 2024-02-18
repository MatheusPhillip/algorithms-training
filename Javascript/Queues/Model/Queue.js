import { Node } from "./Node.js";


export class Queue{
    #node;
    #first;
    #last;
    #length;

    constructor(number){
        this.#node = new Node(number);
        this.#first = this.#node;
        this.#last = this.#node;
        this.#length = 1;
    }

    #getFirst(){
        return this.#first;
    }

    #setFirst(node){
        this.#first = node;
    }

    #getLast(){
        return this.#last;
    }

    #setLast(node){
        this.#last = node;
    }

    #getLength(){
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

    #isEmpty(){
        if(this.#getLength() == 0){
            return true;
        }
        return false;
    }

    peek(){
        return this.#getFirst();
    }

    queue(number){
        const newNode = new Node(number);
        if(this.#isEmpty()){
            this.#setFirst(newNode);
            this.#setLast(newNode);
            this.increaseLength();
            return;
        }

        this.#getLast().setNextNode(newNode);
        this.#setLast(newNode);
        this.increaseLength();
    }

    deQueue(){
        if(this.#isEmpty()){
            console.log("Queue is empty.");
            return this;
        }
        
        const first = this.#getFirst();
        const second = first.getNextNode();

        this.#setFirst(second);
        
        this.decreaseLength();

        return first;
    }
    
}