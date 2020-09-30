package david.augusto.luan;

public class Lampada {

    private boolean ligada;
    private String nome;

    public Lampada(String nome) {
        this.nome = nome;
        this.ligada = false;
    }

    /**
     * Esse metodo alterna o estado da lampada. Ou seja, se ela esta ligada ->
     * desliga e se estiver desligada -> liga
     */
    public void alternar() {
        if (this.ligada == false) {
            this.ligada = true;
        } else {
            this.ligada = false;
        }
    }

    public boolean isLigada() {
        return this.ligada;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
