package compiler.sol;

import compiler.sol.antlr.SolBaseVisitor;
import compiler.sol.antlr.SolParser;
import compiler.sol.components.Tempo;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings("CheckReturnValue")
public class EvalVisitor extends SolBaseVisitor {

    public Object visitExplore(SolParser.ExploreContext ctx) {
        System.out.println("Iniciando etapa Explore");
        return visitChildren(ctx);
    }

    public Object visitPresent(SolParser.PresentContext ctx) {
        System.out.println("Iniciando etapa Present");
        return visitChildren(ctx);
    }

    public Object visitInteract(SolParser.InteractContext ctx) {
        System.out.println("Iniciando etapa Interact");
        return visitChildren(ctx);
    }

    public Object visitCritique(SolParser.CritiqueContext ctx) {
        System.out.println("Iniciando etapa Critique");
        return visitChildren(ctx);
    }

    public Object visitNavegar(SolParser.NavegarContext ctx) {
        Tempo tempo = new Tempo(ctx.TEMPO().getText());
        System.out.println("Navegando por " + tempo.valor() + " segundos");
        return visitChildren(ctx);
    }

    public Object visitVisualizarPdf(SolParser.VisualizarPdfContext ctx) {
        Tempo tempo = new Tempo(ctx.TEMPO().getText());
        String url = (String) visit(ctx.linkPdf());
        System.out.println("Lendo PDF " + url + " por " + tempo.valor() + " segundos");
        return visitChildren(ctx);
    }

    public Object visitVisualizarVideo(SolParser.VisualizarVideoContext ctx) {
        Tempo tempo = new Tempo(ctx.TEMPO().getText());
        String url = (String) visit(ctx.linkVideo());
        System.out.println("Assistindo Video " + url + " por " + tempo.valor() + " segundos");
        return visitChildren(ctx);
    }

    public Object visitVideoconferencia(SolParser.VideoconferenciaContext ctx) {
        Tempo tempo = new Tempo(ctx.TEMPO().getText());
        String url = (String) visit(ctx.linkVideoconferencia());
        System.out.println("Participando da videoconferência " + url + " por " + tempo.valor() + " segundos");
        return visitChildren(ctx);
    }

    public Object visitWhatsappWeb(SolParser.WhatsappWebContext ctx) {
        Tempo tempo = new Tempo(ctx.TEMPO().getText());
        String url = (String) visit(ctx.linkWhatsappWeb());
        System.out.println("Conversando via Whatsapp em " + url + " por " + tempo.valor() + " segundos");
        return visitChildren(ctx);
    }

    public Object visitEmail(SolParser.EmailContext ctx) {
        Tempo tempo = new Tempo(ctx.TEMPO().getText());
        String url = (String) visit(ctx.linkEmail());
        System.out.println("Enviando email para " + url + " por " + tempo.valor() + " segundos");
        return visitChildren(ctx);
    }

    public String visitUrl(SolParser.UrlContext ctx) {
        String url = ctx.getText();
        return url;
    }
}
