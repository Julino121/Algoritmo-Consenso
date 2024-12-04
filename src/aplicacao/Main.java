package aplicacao;
import protocolo.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar nós
        Nodo proponente = new Nodo(1, "Proponente");
        List<Nodo> aceitadores = new ArrayList<>();
        aceitadores.add(new Nodo(2, "Aceitador"));
        aceitadores.add(new Nodo(3, "Aceitador"));
        aceitadores.add(new Nodo(4, "Aceitador"));

        // Proponente faz uma proposta
        Proponente p = new Proponente(1);
        p.proporValor(aceitadores, 42);

        // Simular falha de um aceitador
        aceitadores.get(1).falhar();

        // Nova proposta
        p.proporValor(aceitadores, 50);

        // Recuperação do nó falho
        aceitadores.get(1).recuperar();
        p.proporValor(aceitadores, 100);
    }
}
