class Stack {
  private char[] input;
  private int size;
  Stack(final int length) {
    input = new char[length / 2];
    size = -1;
  }
  public void push(final char c) {
    input[++size] = c;
  }
  public boolean isEmpty() {
    return size == -1;
  }

  public char pop() {
    char c = input[size];
    size--;
    return c;
  }
}




