package javads.linkedList;

public class LinkedList {
  Node head = null;

  public void insert(int value)
  {
    Node node = new Node(value);
    // node.value = value;
    node.Next = head;
    head = node;
  }

  public boolean includes(int value)
  {
    Node current = head;
    boolean results = false;
    while(current != null)
    {
      if(current.value == value)
      {
        results = true;
        break;
      } else {
        current = current.Next;
      }
    }
    return results;
  }

  public String toString()
  {
    Node current = head;
    String linkedString = "";
    while(current != null)
    {
      linkedString += ("{ "+ current.value +" } -> ");
      current = current.Next;
    }
    linkedString += "Null";
    return linkedString;
  }
}
