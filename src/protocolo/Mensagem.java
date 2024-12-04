package protocolo;

public class Mensagem {
    public static void enviarMensagem(int remetente, int destinatario, String conteudo) {
        System.out.println("Nodo " + remetente + " -> Nodo " + destinatario + ": " + conteudo);
    }
}
