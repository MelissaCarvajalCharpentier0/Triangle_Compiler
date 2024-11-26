package Triangle.AbstractSyntaxTrees;

import java.util.LinkedHashMap;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class CaseCommand extends Command {
    //Before there was a Command cAST but, every command is in the map object
    public CaseCommand(Vname vAST, LinkedHashMap<Terminal, Command> map,
                       SourcePosition thePosition) {
      super(thePosition);
      V = vAST;
      MAP = map;

    }

    public Object visit(Visitor v, Object o) {
      return v.visitCaseCommand(this, o);
    }

    public LinkedHashMap<Terminal, Command> MAP;
    public Vname V;
}