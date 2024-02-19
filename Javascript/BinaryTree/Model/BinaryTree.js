import { BinaryTreeNode } from "./BinaryTreeNode.js";

export class BinaryTree{
    #root;

    constructor(){
        this.#root = null;
    }

    getRoot(){
        return this.#root;
    }

    setRoot(binaryTreeNode){
        this.#root = binaryTreeNode;
    }

    insertRecursive(currentNode, number){
        if(currentNode == null){
            const newBinaryTreeNode = new BinaryTreeNode(number);
            return newBinaryTreeNode;
        }

        if(currentNode.getValue() == number){
            console.log("Value already exist.")
            return currentNode;
        }

        if(number < currentNode.getValue()){
            currentNode.setLeft(this.insertRecursive(currentNode.getLeft(), number));
        }
        else if(number > currentNode.getValue()){
            currentNode.setRight(this.insertRecursive(currentNode.getRight(), number));
        }
        return currentNode;
    }

    insert(number){
        this.#root = this.insertRecursive(this.getRoot(), number);
    }

    print(){
        this.#printInOrder(this.getRoot());
    }

    #printInOrder(currentNode){
        if(currentNode.getLeft() != null){
            this.#printInOrder(currentNode.getLeft());
        }

        console.log(currentNode.getValue());

        if(currentNode.getRight() != null){
            this.#printInOrder(currentNode.getRight());
        }
    }
}