package cpp.Absyn; // Java Package generated by the BNF Converter.

public class EDecr  extends Exp {
  public final Exp exp_;
  public EDecr(Exp p1) { exp_ = p1; }

  public <R,A> R accept(cpp.Absyn.Exp.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof cpp.Absyn.EDecr) {
      cpp.Absyn.EDecr x = (cpp.Absyn.EDecr)o;
      return this.exp_.equals(x.exp_);
    }
    return false;
  }

  public int hashCode() {
    return this.exp_.hashCode();
  }


}
