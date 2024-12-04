package protocolo;

public class Nodo {
    private int id;
    private boolean ativo;
    private String papel;

    public Nodo(int id, String papel) {
        this.id = id;
        this.papel = papel;
        this.ativo = true; // O nó começa ativo
    }

    public int getId() {
        return id;
    }

    public String getPapel() {
        return papel;
    }

    public boolean estaAtivo() {
        return ativo;
    }

    public void falhar() {
        ativo = false;
        System.out.println("Nodo " + id + " falhou!");
    }

    public void recuperar() {
        ativo = true;
        System.out.println("Nodo " + id + " foi recuperado.");
    }
}
