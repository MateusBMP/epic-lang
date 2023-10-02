grammar Sol;

/*
 * Parser Rules
 */

sol: LOOP vezes sequencia EOF ;
sequencia: (explore)+
         | present
         | fasesEpic ;
fasesEpic: (explore)+ present interact critique ;
explore: navegar SEMICOLON ;
present: videoconferencia SEMICOLON
       | visualizarVideo SEMICOLON
       | visualizarPdf SEMICOLON ;
interact: videoconferencia SEMICOLON
        | email SEMICOLON
        | whatsappWeb SEMICOLON ;
critique: videoconferencia SEMICOLON
        | email SEMICOLON
        | whatsappWeb SEMICOLON ;

navegar: browser TEMPO ;
visualizarPdf: browser linkPdf TEMPO ;
visualizarVideo: browser linkVideo TEMPO ;
videoconferencia: browser linkVideoconferencia TEMPO ;
whatsappWeb: browser linkWhatsappWeb TEMPO ;
email: browser linkEmail TEMPO ;
browser: NAVEGADOR ;

linkPdf: url ;
linkVideo: url ;
linkVideoconferencia: url ;
linkWhatsappWeb: url ;
linkEmail: url ;

url: STRING ;
vezes: VEZES ;

/*
 * Lexer Rules
 */

SEMICOLON: ';' ;
LOOP: 'loop' ;
NAVEGADOR: 'navegador' ;
VEZES: '1' | '2' | '3' | '4' | '5' ;
TEMPO: '15_min' | '20_min' | '1_hora' | '1_dia' | '2_dias' | 'sem_limite' ;
STRING: [a-zA-Z0-9@:%_+.~#?&/=]+ ;

WS : [ \t\n\r]+ -> skip ;
