package compiler.sol.components;

import java.util.HashMap;
import java.util.Map;

public record Tempo(String tempo) {
    
    private static final Map<String, Integer> TEMPOS = new HashMap<>();

    // Tempos definidos pelo lexer TEMPO (Sol.g4)
    static {
        TEMPOS.put("15_min", 15 * 60);
        TEMPOS.put("20_min", 20 * 60);
        TEMPOS.put("1_hora", 60 * 60);
        TEMPOS.put("1_dia", 24 * 60 * 60);
        TEMPOS.put("2_dias", 2 * 24 * 60 * 60);
        TEMPOS.put("sem_limite", Integer.MAX_VALUE);
    }

    public Tempo(String tempo) {
        if (!TEMPOS.containsKey(tempo)) {
            throw new IllegalArgumentException("Tempo inválido: " + tempo);
        }
        this.tempo = tempo;
    }

    public int valor() {
        return TEMPOS.get(tempo);
    }
}