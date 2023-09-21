// Generated from ./src/compiler/sol/Sol.g4 by ANTLR 4.13.0
package compiler.sol.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SolParser}.
 */
public interface SolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SolParser#sol}.
	 * @param ctx the parse tree
	 */
	void enterSol(SolParser.SolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#sol}.
	 * @param ctx the parse tree
	 */
	void exitSol(SolParser.SolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#sequencia}.
	 * @param ctx the parse tree
	 */
	void enterSequencia(SolParser.SequenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#sequencia}.
	 * @param ctx the parse tree
	 */
	void exitSequencia(SolParser.SequenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#fasesEpic}.
	 * @param ctx the parse tree
	 */
	void enterFasesEpic(SolParser.FasesEpicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#fasesEpic}.
	 * @param ctx the parse tree
	 */
	void exitFasesEpic(SolParser.FasesEpicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#explore}.
	 * @param ctx the parse tree
	 */
	void enterExplore(SolParser.ExploreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#explore}.
	 * @param ctx the parse tree
	 */
	void exitExplore(SolParser.ExploreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#present}.
	 * @param ctx the parse tree
	 */
	void enterPresent(SolParser.PresentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#present}.
	 * @param ctx the parse tree
	 */
	void exitPresent(SolParser.PresentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#interact}.
	 * @param ctx the parse tree
	 */
	void enterInteract(SolParser.InteractContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#interact}.
	 * @param ctx the parse tree
	 */
	void exitInteract(SolParser.InteractContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#critique}.
	 * @param ctx the parse tree
	 */
	void enterCritique(SolParser.CritiqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#critique}.
	 * @param ctx the parse tree
	 */
	void exitCritique(SolParser.CritiqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#navegar}.
	 * @param ctx the parse tree
	 */
	void enterNavegar(SolParser.NavegarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#navegar}.
	 * @param ctx the parse tree
	 */
	void exitNavegar(SolParser.NavegarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#visualizarPdf}.
	 * @param ctx the parse tree
	 */
	void enterVisualizarPdf(SolParser.VisualizarPdfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#visualizarPdf}.
	 * @param ctx the parse tree
	 */
	void exitVisualizarPdf(SolParser.VisualizarPdfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#visualizarVideo}.
	 * @param ctx the parse tree
	 */
	void enterVisualizarVideo(SolParser.VisualizarVideoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#visualizarVideo}.
	 * @param ctx the parse tree
	 */
	void exitVisualizarVideo(SolParser.VisualizarVideoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#videoconferencia}.
	 * @param ctx the parse tree
	 */
	void enterVideoconferencia(SolParser.VideoconferenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#videoconferencia}.
	 * @param ctx the parse tree
	 */
	void exitVideoconferencia(SolParser.VideoconferenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#whatsappWeb}.
	 * @param ctx the parse tree
	 */
	void enterWhatsappWeb(SolParser.WhatsappWebContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#whatsappWeb}.
	 * @param ctx the parse tree
	 */
	void exitWhatsappWeb(SolParser.WhatsappWebContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#email}.
	 * @param ctx the parse tree
	 */
	void enterEmail(SolParser.EmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#email}.
	 * @param ctx the parse tree
	 */
	void exitEmail(SolParser.EmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#browser}.
	 * @param ctx the parse tree
	 */
	void enterBrowser(SolParser.BrowserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#browser}.
	 * @param ctx the parse tree
	 */
	void exitBrowser(SolParser.BrowserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#linkPdf}.
	 * @param ctx the parse tree
	 */
	void enterLinkPdf(SolParser.LinkPdfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#linkPdf}.
	 * @param ctx the parse tree
	 */
	void exitLinkPdf(SolParser.LinkPdfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#linkVideo}.
	 * @param ctx the parse tree
	 */
	void enterLinkVideo(SolParser.LinkVideoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#linkVideo}.
	 * @param ctx the parse tree
	 */
	void exitLinkVideo(SolParser.LinkVideoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#linkVideoconferencia}.
	 * @param ctx the parse tree
	 */
	void enterLinkVideoconferencia(SolParser.LinkVideoconferenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#linkVideoconferencia}.
	 * @param ctx the parse tree
	 */
	void exitLinkVideoconferencia(SolParser.LinkVideoconferenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#linkWhatsappWeb}.
	 * @param ctx the parse tree
	 */
	void enterLinkWhatsappWeb(SolParser.LinkWhatsappWebContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#linkWhatsappWeb}.
	 * @param ctx the parse tree
	 */
	void exitLinkWhatsappWeb(SolParser.LinkWhatsappWebContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#linkEmail}.
	 * @param ctx the parse tree
	 */
	void enterLinkEmail(SolParser.LinkEmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#linkEmail}.
	 * @param ctx the parse tree
	 */
	void exitLinkEmail(SolParser.LinkEmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(SolParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(SolParser.UrlContext ctx);
}