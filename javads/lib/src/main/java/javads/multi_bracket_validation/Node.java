package javads.multi_bracket_validation;

public class Node<T>
{
  T value;
  Node<T> next;

  Node(T value)
  {
    this.value = value;
  }
}
