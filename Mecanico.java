public class Mecanico {

    private String nome;
    private String ferramentaEspecial;
    private int componentes;
    private int vida;

    public Mecanico(String nome, String ferramentaEspecial) {
        this.nome = nome;
        this.ferramentaEspecial = ferramentaEspecial;
        this.componentes = 5;
        this.vida = 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFerramentaEspecial() {
        return ferramentaEspecial;
    }

    public void setFerramentaEspecial(String ferramentaEspecial) {
        this.ferramentaEspecial = ferramentaEspecial;
    }

    public int getComponentes() {
        return componentes;
    }

    public void setComponentes(int componentes) {
        this.componentes = componentes;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}b
