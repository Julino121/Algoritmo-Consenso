package protocolo;

public class Aceitador {
    private int id;
    private int maiorPropostaAceita = -1;

    public Aceitador(int id) {
        this.id = id;
    }

    public void receberProposta(int numeroProposta) {
        if (numeroProposta > maiorPropostaAceita) {
            maiorPropostaAceita = numeroProposta;
            System.out.println("Aceitador " + id + " aceitou a proposta " + numeroProposta);
        } else {
            System.out.println("Aceitador " + id + " rejeitou a proposta " + numeroProposta);
        }
    }
}
