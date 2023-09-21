grammar Sol;

/*
 * Parser Rules
 */

sol: LOOP VEZES sequencia EOF ;
sequencia: explore
         | present
         | fasesEpic ;
fasesEpic: explore present interact critique ;
explore: (navegar TEMPO SEMICOLON)+;
present: visualizarPdf TEMPO SEMICOLON
       | visualizarVideo TEMPO SEMICOLON
       | videoconferencia TEMPO SEMICOLON ;
interact: whatsappWeb TEMPO SEMICOLON
        | email TEMPO SEMICOLON
        | videoconferencia TEMPO SEMICOLON ;
critique: whatsappWeb TEMPO SEMICOLON
        | email TEMPO SEMICOLON
        | videoconferencia TEMPO SEMICOLON ;

navegar: browser ;
visualizarPdf: browser linkPdf ;
visualizarVideo: browser linkVideo ;
videoconferencia: browser linkVideoconferencia ;
whatsappWeb: browser linkWhatsappWeb ;
email: browser linkEmail ;
browser: NAVEGADOR ;

linkPdf: url ;
linkVideo: url ;
linkVideoconferencia: url ;
linkWhatsappWeb: url ;
linkEmail: url ;

url: STRING ;

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
