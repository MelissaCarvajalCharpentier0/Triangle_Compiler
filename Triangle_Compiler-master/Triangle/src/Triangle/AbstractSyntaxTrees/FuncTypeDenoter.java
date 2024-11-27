package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class FuncTypeDenoter extends TypeDenoter {

  public FuncTypeDenoter(FormalParameterSequence fAST, TypeDenoter tAST, Expression eAST, SourcePosition thePosition) {
    super(thePosition);
    FPS = fAST;
    T = tAST;
    E = eAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitFuncTypeDenoter(this, o);
  }

  public boolean equals(Object obj) {
    if (obj != null && obj instanceof ErrorTypeDenoter)
      return true;
    else if (obj != null && obj instanceof FuncTypeDenoter)
      return this.FPS.equals(((FuncTypeDenoter) obj).FPS) &&
              this.T.equals(((FuncTypeDenoter) obj).T) &&
              this.E.equals(((FuncTypeDenoter) obj).E);
    else
      return false;
  }

  public FormalParameterSequence FPS;
  public TypeDenoter T;
  public Expression E;
}