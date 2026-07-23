public class Infiltrador {

    private String nome;
    private String armaPrincipal;
    private int furtividade;
    private int danoAtaque;

    public Infiltrador(String nome, String armaPrincipal, int furtividade) {
        this.nome = nome;
        this.armaPrincipal = armaPrincipal;
        this.furtividade = furtividade;
        this.danoAtaque = 20;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public int getFurtividade() {
        return furtividade;
    }

    public void setFurtividade(int furtividade) {
        this.furtividade = furtividade;
    }

    public int getDanoAtaque() {
        return danoAtaque;
    }

    public void setDanoAtaque(int danoAtaque) {
        this.danoAtaque = danoAtaque;
    }
}
