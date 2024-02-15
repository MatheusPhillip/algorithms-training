
export class Node{
    #number;
    #nextNode;
    #previousNode;

    constructor(number){
        this.#number = number;
        this.#nextNode = null;
        this.#previousNode = null;
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

    getPreviousNode(){
        return this.#previousNode;
    }

    setPreviousNode(node){
        this.#previousNode = node;
    }
}