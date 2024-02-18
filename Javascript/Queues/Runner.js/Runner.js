import { Queue } from "../Model/Queue.js";


const myQueue = new Queue(10);
myQueue.queue(20);
myQueue.queue(30);

console.log(myQueue.peek().getNumber());

myQueue.deQueue();

console.log(myQueue.peek().getNumber());