public class Drone {

    private String modelo;
    private int autonomia;
    private int velocidade;
    private String funcao;

    public Drone(String modelo, int autonomia, int velocidade, String funcao) {
        this.modelo = modelo;
        this.autonomia = autonomia;
        this.velocidade = velocidade;
        this.funcao = funcao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
