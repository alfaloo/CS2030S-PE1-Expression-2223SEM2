class Multiplication extends Operation {
  
  private Operation o1;
  private Operation o2;

  public Multiplication(Operation o1, Operation o2) {
    this.o1 = o1;
    this.o2 = o2;
  }

  @Override
  public Operand eval() throws InvalidOperandException {
    if (this.o1.eval() instanceof Integer && this.o2.eval() instanceof Integer) {
      return new Operand((int) o1.eval() * (int) o2.eval());
    } else {
      throw new InvalidOperandException('*');
    }
  }
}
