import java.util.*;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public interface AaVisitor<T> extends ParseTreeVisitor<T> {
    T visitStart(AaParser.StartContext ctx);
}