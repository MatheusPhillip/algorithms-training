import { Stack } from "../Model/Stack.js";

const myStack = new Stack();

console.log(myStack.peek());

myStack.push(10);

console.log(myStack.peek());

myStack.push(20);

console.log(myStack.pop());
