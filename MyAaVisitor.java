import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.*;

public class MyAaVisitor extends AaBaseVisitor<Void> {
    @Override
    public Void visitStart(AaParser.StartContext ctx) {
        System.out.println("A");
        return null;
    }
}