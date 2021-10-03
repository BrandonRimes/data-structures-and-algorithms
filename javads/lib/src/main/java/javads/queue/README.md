# Queues
<!-- Short summary or background information -->

[Back](../../../../../../../README.md) to Data Structures & Algorithms

## Challenge
<!-- Description of the challenge -->

### Node

- Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.

### Queue
- Create a Queue class that has a front property. It creates an empty Queue when instantiated.
- This object should be aware of a default empty value assigned to front when the queue is created.
- The class should contain the following methods:
  - **enqueue**
  Arguments: value
  adds a new node with that value to the back of the queue with an O(1) Time performance.
  - **dequeue**
  Arguments: none
  Returns: the value from node from the front of the queue.
  Removes the node from the front of the queue.
  Should raise exception when called on empty queue.
  - **peek**
  Arguments: none
  Returns: Value of the node located at the front of the queue.
  Should raise exception when called on empty stack.
  - **is empty**
  Arguments: none
  Returns: Boolean indicating if the queue is empty.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

## API
<!-- Description of each method publicly available to your Stack and Queue-->
