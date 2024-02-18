import { Node } from "./Node.js";

export class Stack {
    #node;
    #top;
    #length;

    constructor(number){
        this.#node = new Node(number);
        this.#top = this.#node;
        this.#length = 1;
    }

    #getTop(){
        return this.#top;
    }

    #setTop(node){
        this.#top = node;
    }

    getLength(){
        return this.#length;
    }

    #increaseLength(){
        this.#length = this.#length + 1;
    }

    #decreaseLength(){
        if(this.#length > 0){
            this.#length = this.#length - 1;
        }
    }

    #isEmpty(){
        if(this.getLength == 0){
            return true;
        }
        return false;
    }

    push(number){
        let newNode = new Node(number);
        newNode.setNextNode(this.#getTop());
        this.#setTop(newNode);
        this.#increaseLength();
    }

    pop(){
        if(this.#isEmpty()){
            console.log("Stack is empty. Nothing to pop");
            return;
        }
        const topNode = this.#getTop();
        this.#setTop(this.#getTop().getNextNode());

        this.#decreaseLength();
        console.log("Top Node: " + topNode.getNumber() + " removed.");
        return topNode;
    }

    peek(){
        return this.#getTop().getNumber();
    }
}