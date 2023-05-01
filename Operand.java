/**
 * CS2030S PE1 Question 1
 * AY20/21 Semester 2
 *
 * @author A0000000X
 */

class Operand extends Operation {

  private Object value;

  public Operand(Object value) {
    this.value = value;
  }

  public Object eval() {
    return this.value;
  }

}
