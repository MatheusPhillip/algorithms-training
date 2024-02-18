import { Stack } from "../Model/Stack.js";

const myStack = new Stack(1);

myStack.push(2);
myStack.push(3);

console.log(myStack.peek());

myStack.pop();

console.log(myStack.peek());
