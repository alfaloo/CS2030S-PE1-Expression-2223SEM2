/**
 * CS2030S PE1 Question 1
 * AY20/21 Semester 2
 *
 * @author A0000000X
 */

abstract class Operation {

  public static Operand of(char c, Operation op1, Operation op2) {
      if (c == '*') {
        Multiplication o =  new Multiplication(op1, op2);
        return o.eval();
      } else if (c == '+') {
        Concatenation o =  new Concatenation(op1, op2);
        return o.eval();
      } else if (c == '^') {
        XOR o =  new XOR(op1, op2);
        return o.eval();
      } else {
        return null;
      }
  }

  public abstract Object eval();

}
