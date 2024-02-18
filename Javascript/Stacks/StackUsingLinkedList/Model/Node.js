
export class Node{
    #number;
    #nextNode;

    constructor(number){
        this.#number = number;
        this.#nextNode = null;
    }

    getNumber(){
        return this.#number;
    }

    setNumber(number){
        this.#number = number;
    }

    getNextNode(){
        return this.#nextNode;
    }

    setNextNode(node){
        this.#nextNode = node;
    }
}