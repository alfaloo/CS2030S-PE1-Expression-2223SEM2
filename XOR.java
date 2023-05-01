class XOR extends Operation {
  
  private Operation o1;
  private Operation o2;

  public XOR(Operation o1, Operation o2) {
    this.o1 = o1;
    this.o2 = o2;
  }

  @Override
  public Operand eval() throws InvalidOperandException {
    if (this.o1.eval() instanceof Boolean && this.o2.eval() instanceof Boolean) {
      return new Operand((boolean) o1.eval() ^ (boolean) o2.eval());
    } else {
      throw new InvalidOperandException('^');
    }
  }
}
