package EngenhariadeSoftwareIII.Strategy;

public class Teste {

    public static void main(String[] args) {

        Cliente lucas = new Cliente();

        lucas.setFestival(new EntradaComum());
        lucas.participarFestival();

        System.out.println("--------------------------------");

        lucas.setFestival(new EntradaVIP());
        lucas.participarFestival();
    }
}