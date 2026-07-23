public class Hacker {

    private String nome;
    private int nivelAcesso;
    private String dispositivoPrincipal;
    private double creditos;

    public Hacker(String nome, int nivelAcesso, String dispositivoPrincipal) {
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
        this.dispositivoPrincipal = dispositivoPrincipal;
        this.creditos = 100.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getDispositivoPrincipal() {
        return dispositivoPrincipal;
    }

    public void setDispositivoPrincipal(String dispositivoPrincipal) {
        this.dispositivoPrincipal = dispositivoPrincipal;
    }

    public double getCreditos() {
        return creditos;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }
}
