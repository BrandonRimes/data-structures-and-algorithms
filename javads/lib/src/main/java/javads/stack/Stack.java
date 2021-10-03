package javads.stack;

import stack.Node;

public class Stack<T>
{
    Node<T> top;

    void push(T valueToPush)
    {
        top.next = top;
        top = valueToPush;
    }

    T pop()
    {
        if(top)
        {
        T poppedValue = top.value;
        top = top.next;
        return poppedValue;
        } else {
          throw new Exception("Empty Stack");
        }
    }

    T peek()
    {
        if(top)
        {
        return top.value;
        } else {
          throw new Exception("Empty Stack");
        }
    }

    boolean isEmpty()
    {
        top ? return true : return false;
    }
}
