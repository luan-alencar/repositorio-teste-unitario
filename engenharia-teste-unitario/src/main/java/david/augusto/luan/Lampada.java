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

    public Lampada() {
        super();
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

    // implementei o metodo equals()
    public boolean equals(Object obj) {
        // se o obj for vazio retorn falso
        if (obj == null) {
            return false;
        }
        // criei uma variavel do tipo Lampada
        Lampada comparavel;
        // se o obj for uma instancia da classe Lampada
        if (obj instanceof Lampada) {
            // a variavel comparavel recebe aquele obj
            comparavel = (Lampada) obj;
        } else {
            // se nao, retorne falso
            return false;
        }
        // se os atributos do obj contido na variavel comparavel forem iguais ao
        // do atributo daquele obj retorn true
        if (comparavel.nome == this.nome && comparavel.ligada == this.ligada) {
            return true;
        }
        // se nao, retorne falso
        return false;
    }
}