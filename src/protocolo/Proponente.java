package protocolo;
import java.util.List;

public class Proponente {
    private int id;
    private int proposta;

    public Proponente(int id) {
        this.id = id;
    }

    public void proporValor(List<Nodo> aceitadores, int valor) {
        System.out.println("Proponente " + id + " propondo valor: " + valor);
        proposta = valor;

        for (Nodo aceitador : aceitadores) {
            if (aceitador.estaAtivo()) {
                Mensagem.enviarMensagem(id, aceitador.getId(), "Proposta " + valor);
            }
        }
    }
}
