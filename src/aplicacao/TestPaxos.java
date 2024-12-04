package aplicacao;
import protocolo.Nodo;

public class TestPaxos {
    public static void main(String[] args) {
        System.out.println("Teste: Consenso com nós ativos");
        Main.main(new String[] {});

        System.out.println("\nTeste: Falha e recuperação de nó");
        Nodo nodo = new Nodo(2, "Aceitador");
        nodo.falhar();
        nodo.recuperar();
    }
}
