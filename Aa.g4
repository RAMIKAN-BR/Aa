grammar Aa;

@header {
import java.util.*;
}

@members {
// Criação do AaBaseVisitor
public abstract class AaBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements AaVisitor<T> {

}

// Definição da interface AaVisitor
public interface AaVisitor<T> extends ParseTreeVisitor<T> {

}
}

start: 'a' { System.out.println("A"); };