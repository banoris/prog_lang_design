package cpp.Absyn; // Java Package generated by the BNF Converter.

public class SReturnVoid  extends Stm {
  public SReturnVoid() { }

  public <R,A> R accept(cpp.Absyn.Stm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof cpp.Absyn.SReturnVoid) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}