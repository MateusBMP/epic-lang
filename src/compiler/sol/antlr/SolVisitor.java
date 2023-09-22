// Generated from ./src/compiler/sol/Sol.g4 by ANTLR 4.13.0
package compiler.sol.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SolParser#sol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSol(SolParser.SolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#sequencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequencia(SolParser.SequenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#fasesEpic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFasesEpic(SolParser.FasesEpicContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#explore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplore(SolParser.ExploreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#present}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPresent(SolParser.PresentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#interact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteract(SolParser.InteractContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#critique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCritique(SolParser.CritiqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#navegar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavegar(SolParser.NavegarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#visualizarPdf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisualizarPdf(SolParser.VisualizarPdfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#visualizarVideo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisualizarVideo(SolParser.VisualizarVideoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#videoconferencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVideoconferencia(SolParser.VideoconferenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#whatsappWeb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhatsappWeb(SolParser.WhatsappWebContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#email}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmail(SolParser.EmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#browser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrowser(SolParser.BrowserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#linkPdf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkPdf(SolParser.LinkPdfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#linkVideo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkVideo(SolParser.LinkVideoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#linkVideoconferencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkVideoconferencia(SolParser.LinkVideoconferenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#linkWhatsappWeb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkWhatsappWeb(SolParser.LinkWhatsappWebContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#linkEmail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkEmail(SolParser.LinkEmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(SolParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolParser#vezes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVezes(SolParser.VezesContext ctx);
}