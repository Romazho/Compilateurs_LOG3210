package analyzer.ast;/* Generated By:JJTree: Do not edit this line. ASTMultExpr.java */

import java.util.Vector; // PLB

public class ASTMultExpr extends SimpleNode {
  public ASTMultExpr(int id) {
    super(id);
  }

  public ASTMultExpr(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  // PLB
  private Vector<String> m_ops = new Vector<>();
  public void addOp(String o) { m_ops.add(o); }
  public Vector getOps() { return m_ops; }
}
