export class BinaryTreeNode{
    #value;
    #left;
    #right;

    constructor(number){
        this.#value = number;
        this.#left = null;
        this.#right = null;
    }

    getValue(){
        return this.#value;
    }

    setValue(number){
        this.#value = number;
    }

    getLeft(){
        return this.#left;
    }

    setLeft(binaryTreeNode){
        this.#left = binaryTreeNode;
    }

    getRight(){
        return this.#right;
    }

    setRight(binaryTreeNode){
        this.#right = binaryTreeNode;
    }
}