public class Main {

    public static void main(String[] args) {

        Hacker hacker = new Hacker("Zero", 7, "Deck Sombra");
        Mecanico mecanico = new Mecanico("Wrench", "Chave-Mestra");
        Infiltrador infiltrador = new Infiltrador("Ghost", "Katana de Plasma", 9);

        hacker.setCreditos(150.0);
        mecanico.setVida(90);
        infiltrador.setFurtividade(10);

        System.out.println(hacker.getNome());
        System.out.println(hacker.getCreditos());

        System.out.println(mecanico.getNome());
        System.out.println(mecanico.getVida());

        System.out.println(infiltrador.getNome());
        System.out.println(infiltrador.getFurtividade());

        Drone drone = new Drone("Falcon", 100, 80, "Patrulha");

        drone.setVelocidade(90);

        System.out.println(drone.getModelo());
        System.out.println(drone.getVelocidade());
    }
}
