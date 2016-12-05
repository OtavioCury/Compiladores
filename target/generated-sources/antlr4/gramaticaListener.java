// Generated from gramatica.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#gramatica}.
	 * @param ctx the parse tree
	 */
	void enterGramatica(@NotNull gramaticaParser.GramaticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#gramatica}.
	 * @param ctx the parse tree
	 */
	void exitGramatica(@NotNull gramaticaParser.GramaticaContext ctx);
}