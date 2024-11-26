package Triangle.AbstractSyntaxTrees;

import java.util.LinkedHashMap;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class CaseExpression extends Expression {
    //Before there was a Command cAST but, every command is in the map object
    public CaseExpression(Vname vAST, LinkedHashMap<Terminal, Expression> map,
                       SourcePosition thePosition) {
        super(thePosition);
        V = vAST;
        MAP = map;

    }

    public Object visit(Visitor v, Object o) {
        return v.visitCaseExpression(this, o);
    }

    public LinkedHashMap<Terminal, Expression> MAP;
    public Vname V;
}