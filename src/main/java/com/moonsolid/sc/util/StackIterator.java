package com.moonsolid.sc.util;

public class StackIterator<E> implements Iterator<E> {
  
  Stack<E> stack;
  
  public StackIterator(Stack<E> stack) {
    this.stack = stack.clone();
  }
  
  @Override
  public boolean hasNext() {
    return !stack.empty();
  }
  
  public E next() {
    return stack.pop();
  }
  
  
  
}
