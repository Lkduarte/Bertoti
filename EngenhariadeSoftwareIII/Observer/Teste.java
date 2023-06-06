package EngenhariadeSoftwareIII.Observer;

public class Teste {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();

        new NotifyAllEstados(magazine);

        magazine.setEstado("VEJA");

        System.out.println("\n----------------------------------------\n");

        magazine.setEstado("ESTADÃO");
    }
}