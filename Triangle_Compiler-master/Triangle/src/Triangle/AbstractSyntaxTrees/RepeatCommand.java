package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;

public class RepeatCommand extends Command {
    public RepeatCommand(Command cAST, Expression eAST, SourcePosition thePosition){
        super(thePosition);
        C = cAST;
        E = eAST;
    }
    public Object visit(Visitor v, Object o)
    { return v.visitRepeatCommand(this, o); }
    public Command C;
    public Expression E;
}

