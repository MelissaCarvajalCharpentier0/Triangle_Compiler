package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ProcTypeDenoter extends TypeDenoter {

    public ProcTypeDenoter(Identifier iAST, FormalParameterSequence fAST, Command commandAST, SourcePosition thePosition) {
        super(thePosition);
        I = iAST;
        FPS = fAST;
        C = commandAST;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitProcTypeDenoter(this, o);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ErrorTypeDenoter)
            return true;
        else if (obj != null && obj instanceof ProcTypeDenoter)
            return this.I.equals(((ProcTypeDenoter) obj).I) &&
                    this.FPS.equals(((ProcTypeDenoter) obj).FPS) &&
                    this.C.equals(((ProcTypeDenoter) obj).C);
        else
            return false;
    }

    public Identifier I;
    public FormalParameterSequence FPS;
    public Command C;
}
