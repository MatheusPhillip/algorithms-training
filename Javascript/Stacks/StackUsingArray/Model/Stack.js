export class Stack{
    array;
    constructor(){
        this.array = [];
    }

    #getArray(){
        return this.array;
    }

    peek(){
        if(this.#getArray().length == 0){
            console.log("Stack is Empty.");
            return;
        }
        const array = this.#getArray();
        return array[array.length - 1];
    }

    push(number){
        this.#getArray().push(number);
    }

    pop(){
        this.#getArray().pop();
        return this;
    }
    
}