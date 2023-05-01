class Concatenation extends Operation {
  
  private Operation o1;
  private Operation o2;

  public Concatenation(Operation o1, Operation o2) {
    this.o1 = o1;
    this.o2 = o2;
  }

  @Override
  public Operand eval() throws InvalidOperandException {
    if (this.o1.eval() instanceof String && this.o2.eval() instanceof String) {
      return new Operand((String) o1.eval() + (String) o2.eval());
    } else {
      throw new InvalidOperandException('+');
    }
  }
}
